package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * A programme that determines whether a year is leap or not.
 *
 * @author Giorgio
 * @version 1.1
 * @since 10-04-2026
 */

public class LeapYearOrNotApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int inputYear = 0;


        //Read input - Keyboard scanning
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a year for definition.");     //Prompt to the user

        //Input - Data binding
        inputYear = scanner.nextInt();

        //Programme logic - calculations
        if ( (inputYear % 400 == 0) || ((inputYear % 4 == 0) && (inputYear % 100 != 0)) ) {
            System.out.printf("The year %d is leap (366 days).%n", inputYear);
        } else {
            System.out.printf("The year %d is regular (365 days).%n" , inputYear);
        }
    }
}
