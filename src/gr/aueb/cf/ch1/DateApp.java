package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * A program that reads three integer number given by the user
 * representing the day, the month and the year with the following way:
 * DD/MM/YY
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-07
 */

public class DateApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int day = 0;
        int month = 0;
        int inputYear = 0;
        int year = 0;

        //Read input - Keyboard scanning
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert three numbers for day, month and year accordingly: ");

        //Input - Data Binding
        day = scanner.nextInt();
        month = scanner.nextInt();
        inputYear = scanner.nextInt();

        //Logic
        year = inputYear % 100;

        //Output Date
        System.out.printf("%02d/%02d/%02d", day, month, year);
    }
}
