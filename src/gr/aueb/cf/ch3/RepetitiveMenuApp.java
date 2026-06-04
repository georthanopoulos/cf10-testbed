package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Δημιουργία ενός προγράμματος που εμφανίζει επαναληπτικά ένα
 * μενού επιλογών (1-4) μέχρι ο χρήστης να πατήσει τον αριθμό 5 για έξοδο.
 * Με κάθε επιλογή εμφανίζεται ανάλογο μήνυμα και απο την αρχή το μενού.
 * Επίσης γίνεται έλεγχος για την περίπτωση που εισαχθεί αριθμός μικροτερος του 1
 * και μεγαλύτερος του 5 και δίνεται κατάλληλο μήνυμα.
 * 1.Εισαγωγή
 * 2.Διαγραφή
 * 3.Ενημέρωση
 * 4.Αναζήτηση
 * 5.Έξοδος
 *
 * @author Giorgio
 * @version 1.2
 * @since 10-04-2026
 */
public class RepetitiveMenuApp {

    public static void main(String[] args) {

        //Declaration and Initialization of variables
        int choice = 0;

        //Read input - Keyboard scanning
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε μία απο τις παρακάτω επιλογές: ");   //Prompt to the user
            System.out.println("1. Εισαγωγή");                                         //Menu presentation
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();                                                //Data Binding

            if (choice == 1) {
                System.out.println("Επιλέξατε εισαγωγή.");                             //Output- feedback

            } else if (choice == 2) {
                System.out.println("Επιλέξατε διαγραφή.");

            } else if (choice == 3) {
                System.out.println("Επιλέξατε ενημέρωση.");

            } else if (choice == 4) {
                System.out.println("Επιλέξατε αναζήτηση.");

            } else if (choice == 5){
                System.out.println("Έξοδος.");
                break;
            } else {
                System.out.println("Λάθος αριθμός! Παρακαλώ επιλέξτε μία απο τις επιλογές (1 - 5): ");  //Prompt to the user
            }
        }
    }
}
