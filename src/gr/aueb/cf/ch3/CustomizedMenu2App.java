package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */

public class CustomizedMenu2App {

    public static void main(String[] args) {

        int choice = 0;

        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε μία απο τις παρακάτω επιλογές: ");
            System.out.println("1. Εισαγωγή προιόντος");
            System.out.println("2. Ενημέρωση προιόντος");
            System.out.println("3. Διαγραφή προιόντος");
            System.out.println("4. Αναζήτηση προιόντος");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Παρακαλώ εισάγετε πληροφορίες προιόντος.");
                break;

            } else if (choice == 2) {
                System.out.println("Εισήλθατε στο μενού ενημέρωσης προιόντος");
                break;

            } else if (choice == 3) {
                System.out.println("Επιλέξτε το προιόν προς διαγραφή");
                break;

            }else if (choice == 4) {
                System.out.println("Ποιό προιόν ψάχνετε? Εισάγεται κωδικό προιόντος.");
                break;

            }else if (choice == 5){
                System.out.println("Ευχαριστούμε για την επιλογή της εφαρμογής μας.");
                break;

            } else {
                System.out.println("Παρακαλώ επιλέξτε μία απο τις παρακάτω επιλογές: ");
                System.out.println("1. Εισαγωγή προιόντος");
                System.out.println("2. Ενημέρωση προιόντος");
                System.out.println("3. Διαγραφή προιόντος");
                System.out.println("4. Αναζήτηση προιόντος");
                System.out.println("5. Έξοδος");
                choice = scanner.nextInt();
            }
        }

    }
}
