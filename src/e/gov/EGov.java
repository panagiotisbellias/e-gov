package e.gov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Panagiotis Bellias
 */
public final class EGov {

    private static final Logger LOG = Logger.getLogger(EGov.class.getName());
    private static final String TEST_MODE = "--test";

    private EGov() {}

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        if (args.length > 0 && TEST_MODE.equals(args[0])) {
            return;
        }
        
        List<Affirmation> documents = new ArrayList<>();
        int id = 1; 
        boolean exit = false;
        
        try (Scanner input = new Scanner(System.in)) {
            while(!exit) {
                LOG.info("Choose operation:\n"
                        + "1 for document creation,\n"
                        + "2 for document checking and \n"
                        + "3 to quit the program");
                
                if (!input.hasNextInt()) {
                    input.next(); // consume invalid input
                    LOG.info("Please enter a valid number.");
                    continue;
                }
                
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        Affirmation affirmation = Affirmation.createOne(id, input);
                        id++;
                        documents.add(affirmation);
                        affirmation.logSummary(LOG);
                        break;
                    case 2:
                        List<Affirmation> results = Affirmation.searching(documents, input);
                        Affirmation.docResults(results);
                        break;
                    case 3:
                        LOG.info("Bye!");
                        exit = true;
                        break;
                    default:
                        LOG.info("Not right number. Try again");
                        break;
                }
            }
        }
    }
    
}
