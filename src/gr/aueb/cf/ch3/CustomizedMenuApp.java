package gr.aueb.cf.ch3;

import java.util.Scanner;

public class CustomizedMenuApp {

    public static void main(String[] args) {

        int choice = 0;

        Scanner scanner = new Scanner (System.in);

        do {
            System.out.println("Παρακαλώ επιλέξτε μία απο τις παρακάτω επιλογές: ");
            System.out.println("1. Εισαγωγή προιόντος");
            System.out.println("2. Ενημέρωση προιόντος");
            System.out.println("3. Διαγραφή προιόντος");
            System.out.println("4. Αναζήτηση προιόντος");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();


        } while (choice != 5);

            System.out.println("Ευχαριστούμε για την επιλογή της εφαρμογής μας.");

    }
}
