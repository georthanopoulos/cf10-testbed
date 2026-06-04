package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Division of two integer numbers - Error Handling and Linearization.
 */
public class NumDenomErrorControlLinearizationApp {

    public static void main(String[] args) {

        //Declaration and Initizalization of Variables
        int numerator;
        int denominator;
        int result = 0;

        //Rean input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        //Programme Logic
        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.print("Numerator is 0. Quitting...");
                break;

            }

            System.out.println("Please insert denominator ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Cannot divide with zero");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result = " + result);
        }


    }


}
