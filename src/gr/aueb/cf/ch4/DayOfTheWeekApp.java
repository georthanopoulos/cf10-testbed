package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένα πρόγραμμα που δέχεται έναν ακέραιο (1-7) και επιστρέφει
 * το αντίστοιχο όνομα της ημέρας της εβδομάδας (π.χ., 1 → "Δευτέρα").
 *
 * @author Giorgio
 * @version 1.10
 * @since 21-04-2026
 */
public class DayOfTheWeekApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int dayNum = 0;
        String dayOfTheWeek = "";

        //Read input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number (1-7): "); //Prompt to the user

        //Data binding
        dayNum = scanner.nextInt();

        dayOfTheWeek = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Wrong number! Please try again by entering a number (1-7).";
        };

        //Output Data - Print
        System.out.println("The day of the week is: " + dayOfTheWeek);
        }
    }
