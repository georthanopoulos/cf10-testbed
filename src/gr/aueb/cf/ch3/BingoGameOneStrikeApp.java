package gr.aueb.cf.ch3;

/**
 * Υπάρχει ένα SECRET που ειναι integer και ο χρήστης με
 * μία μόνο προσπάθεια θα προσπαθήσει να τον βρεί. One Strike only!
 */

import java.util.Scanner;

public class BingoGameOneStrikeApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        final int SECRET = 7;
        int inputNum = 0;

        //Read Input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please guess the key number!");   //Prompt to the user
        inputNum = scanner.nextInt();                         //Data Binding

        if (inputNum != SECRET) {
            System.out.println("Secret error!!!");
            System.exit(1);
        }


        System.out.println("Secret was valid! You may go on.");
    }
}