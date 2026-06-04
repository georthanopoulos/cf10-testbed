package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 *
 * A program that calculates the Max amogst three Integer numbers.
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-06
 */
public class MaxOfThreeNumbersApp {

    public static void main(String[] args) {

//Declaration and Initialization of Variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int maxOfTwo = 0;
        int totalMax = 0;

        //Keyboard Scanning Command
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please dial three numbers: ");

        //Calculations

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        maxOfTwo = Math.max(num1,num2);
        totalMax = Math.max(maxOfTwo, num3);




        //Output - Results
        System.out.printf("The Maximum Number Amongst the Three is: %d\n", totalMax);

    }
}