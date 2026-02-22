package authorized;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Panagiotis Bellias
 */
public class AuthorizedPerson implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(AuthorizedPerson.class.getName());
    
    private long taxIdentificationNumber;
    private String fullName;
    private String identityCard;

    public AuthorizedPerson(long taxIdentificationNumber, String fullName, String identityCard) {
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.fullName = fullName;
        this.identityCard = identityCard;
    }

    public AuthorizedPerson() {
    }
    
    public long getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(long taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
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
    
    public static AuthorizedPerson createOne(Scanner input){

        AuthorizedPerson authorizedPerson = new AuthorizedPerson();
        LOG.info("Please enter the tax identification number of the authorized person: ");
        authorizedPerson.setTaxIdentificationNumber(input.nextLong());
        input.nextLine(); // consume newline
        LOG.info("Please enter the full name of the authorized person: ");
        authorizedPerson.setFullName(input.nextLine());
        LOG.info("Please enter the identity card of the authorized person: ");
        authorizedPerson.setIdentityCard(input.nextLine());

        return authorizedPerson;
        
    }

    public boolean isValid() {
        return fullName != null && !fullName.isEmpty() &&
                identityCard != null && !identityCard.isEmpty() &&
                taxIdentificationNumber > 0;
    }

    public String getDisplayName() {
        return fullName + " (" + identityCard + ")";
    }

    public boolean matchesTaxId(long taxId) {
        return taxIdentificationNumber == taxId;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizedPerson that = (AuthorizedPerson) o;
        return taxIdentificationNumber == that.taxIdentificationNumber;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(taxIdentificationNumber);
    }
    
}
