package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Α program that prints a menu with 6 choices
 */

public class StarsMenuEx1 {

    public static void main(String[] args) {

        int choice = 0;
        final int EXIT = 6;

        //Read Input Keyboard scanning
        Scanner scanner = new Scanner(System.in);

        while (true) {

            printMenu();
            choice = getChoice(scanner);

            if (choice == EXIT) {
                System.out.println("Exiting program...");
                break;
            }

            if (!isChoiceValid(choice)) {
                System.out.println("Invalid choice. Please choose an option between 1 and 5.");
                continue;
            }

            System.out.println("Please enter number of stars.");
            int numStars = getChoice(scanner);

            switch (choice) {
                case 1 -> {
                    printHorizontally(numStars);
                    System.out.println();
                }
                case 2 -> {
                    printVertically(numStars);
                    System.out.println();
                }
                case 3 -> {
                    printNLines(numStars);
                    System.out.println();
                }
                case 4 -> {
                    printNLinesOneToN(numStars);
                    System.out.println();
                }
                case 5 -> {
                    printNLinesNToOne(numStars);
                    System.out.println();
                }
            }
        }

    }

    /**
     * Η μέθοδος εκτυπώνει το κεντρικό μενού.
     */
    public static void printMenu() {
        System.out.println("1. Print n-stars horizontally");
        System.out.println("2. Print n-stars vertically");
        System.out.println("3. Print n-lines with n-stars");
        System.out.println("4. Print n-lines with (1 to n)-stars");
        System.out.println("5. Print n-stars with (n to 1)-stars");
        System.out.println("6. Exit program");
        System.out.println();
        System.out.println("Enter your choice:");
    }

    /**
     * Η μέθοδος διαβάζει το πληκτρολόγιο (είσοδο)
     * και ελέγχει την εγκυρότητα της εισόδου αν είναι int
     * @param scanner  keyboard scanning
     * @return    Return  Data Binding
     */
    public static int getChoice(Scanner scanner) {

        while (!scanner.hasNextInt()) {                      //checks if the next given input is int.
            System.out.println("Invalid input! Please try again! ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Έλεγχος εγκυρότητας επιλογής χρήστη μεταξύ 1 και 5.
     * @param choice   αριθμός επιλογής μενού από χρήστη.
     * @return true / false
     */
    public static boolean isChoiceValid(int choice) {

        return choice >= 1 && choice <= 5;
    }

    /**
     * Η μέθοδος εμφανίζει n αστεράκια οριζόντια.
     * @param n  αριθμός αστεριών απο τον χρήστη.
     */
    public static void printHorizontally(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    /**
     * Η μέθοδος εμφανίζει n αστεράκια κάθετα.
     * @param n  αριθμός αστεριών απο τον χρήστη.
     */
    public static void printVertically(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Η μέθοδος εμφανίζει n γραμμές με n αστεράκια.
     * @param n   αριθμός αστεριών απο τον χρήστη.
     */
    public static void printNLines (int n) {
        for (int i = 1; i <= n; i++) {
            printHorizontally(n);
            System.out.println();
        }
    }

    /**
     * Η μέθοδος εμφανίζει n γραμμές με αστεράκια 1 έως n.
     * @param n  αριθμός αστεριών απο τον χρήστη.
     */
    public static void printNLinesOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            printHorizontally(i);
            System.out.println();
        }
    }

    /**
     * Η μέθοδος εμφανίζει n γραμμές με n έως 1 αστεράκια.
     * @param n    αριθμός αστεριών απο τον χρήστη.
     */
    public static void printNLinesNToOne(int n) {
        for (int i = n; i >= 1; i--) {
            printHorizontally(i);
            System.out.println();
        }
    }
}
