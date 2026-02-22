package e.gov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Panagiotis Bellias
 */
public class Affirmation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(Affirmation.class.getName());
    private static final int RECEIPT_REASON = 1;
    private static final int DEPOSIT_REASON = 2;
    private static final String NO_RESPONSE = "NO";

    private long taxIdentificationNumber;
    private long cellPhoneNumber;
    private String fullName;
    private String identityCard;
    private String depositor;
    private String statementText;
    private int uniqueCode;

    public Affirmation(long taxIdentificationNumber, long cellPhoneNumber, String fullName, String identityCard, 
            String depositor, String statementText, int uniqueCode) {
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.cellPhoneNumber = cellPhoneNumber;
        this.fullName = fullName;
        this.identityCard = identityCard;
        this.depositor = depositor;
        this.statementText = statementText;
        this.uniqueCode = uniqueCode;
    }

    public Affirmation() {
    }

    public long getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(long taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getDepositor() {
        return depositor;
    }

    public void setDepositor(String depositor) {
        this.depositor = depositor;
    }

    public String getStatementText() {
        return statementText;
    }

    public void setStatementText(String statementText) {
        this.statementText = statementText;
    }

    public int getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
    
    public static Affirmation createOne(int id, Scanner input){

        LOG.info("Please enter your tax identification number: ");
        long taxIdentificationNumberValue = input.nextLong();
        input.nextLine();
        LOG.info("Please enter your full name: ");
        String fullNameValue = input.nextLine();
        LOG.info("Please enter your cell phone number: ");
        long cellPhoneNumberValue = input.nextLong();
        input.nextLine();
        LOG.info("Please enter your identity card: ");
        String identityCardValue = input.nextLine();

        LOG.info("Please enter the depositor: ");
        String depositorValue = input.nextLine();
        while (!isDepositorValid(depositorValue)) {
            LOG.info("Too long name for depositor. Try again...");
            depositorValue = input.nextLine();
        }

        LOG.info("Please enter your text of statement: ");
        String statementTextValue = input.nextLine();
        while (!isStatementTextValid(statementTextValue)) {
            LOG.info("Too long text. Try again...");
            statementTextValue = input.nextLine();
        }

        LOG.info("Is your document an authorization? Enter \"YES\" or \"NO\": ");
        String authorizationDoc = input.next();

        if (NO_RESPONSE.equalsIgnoreCase(authorizationDoc)) {
            return new Affirmation(taxIdentificationNumberValue, cellPhoneNumberValue, fullNameValue, identityCardValue,
                    depositorValue, statementTextValue, id);
        }

        // Create authorization for non-NO responses
        Authorization authorization = new Authorization(taxIdentificationNumberValue, cellPhoneNumberValue, fullNameValue,
                identityCardValue, depositorValue, statementTextValue, id);
        authorization.createAndSetAuthorizedPerson(input);
        LOG.info("Please enter the reason of authorization: \n"
                + "1 for receipt, \n"
                + "2 for deposit or \n"
                + "3 for signature");
        int reasonCode = input.nextInt();
        input.nextLine();
        String reason;
        switch (reasonCode) {
            case RECEIPT_REASON:
                reason = "Receipt";
                break;
            case DEPOSIT_REASON:
                reason = "Deposit";
                break;
            default:
                reason = "Signature";
                break;
        }
        authorization.setAuthorizationReason(reason);
        return authorization;

    }

    private static boolean isDepositorValid(String depositor) {
        return depositor != null && depositor.length() <= 12;
    }

    private static boolean isStatementTextValid(String statementText) {
        return statementText != null && statementText.length() <= 15;
    }
    
    public static List<Affirmation> searching(List<Affirmation> documents, Scanner input){
        
        LOG.info("Enter your unique document code: ");
        int id = input.nextInt();
        List<Affirmation> results = new ArrayList<>();
        if (documents != null) {
            for (Affirmation document : documents) {
                if (document != null && document.hasUniqueCode(id)) {
                    results.add(document);
                }
            }
        }
        return results;
        
    }

    public boolean hasUniqueCode(int id) {
        return this.uniqueCode == id;
    }
    
    public static void docResults(List<Affirmation> results){
        if (results == null) {
            return;
        }
        for (Affirmation aff : results) {
            if (aff != null && LOG.isLoggable(Level.INFO)) {
                String kind = aff.getDocumentKind();
                LOG.info("Unique Document Code: " + aff.getUniqueCode() + "\n"
                        + "Citizen Full Name: " + aff.getFullName() + "\n"
                                + "Document Kind: " + kind);
            }
        }
        
    }

    private boolean hasValidStatementText() {
        return statementText != null && !statementText.trim().isEmpty();
    }

    public boolean isValid() {
        return hasValidStatementText();
    }

    
    public String getDocumentKind() {
        return this.getClass().getSimpleName();
    }

    public void logSummary(Logger log) {
        if (log != null && log.isLoggable(Level.INFO)) {
            log.info(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Document is created for " + getFullName() + "\n"
                + "with unique docuement code: " + getUniqueCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Affirmation that = (Affirmation) o;
        return uniqueCode == that.uniqueCode;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(uniqueCode);
    }
}
