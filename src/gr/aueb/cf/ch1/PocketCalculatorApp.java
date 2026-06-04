package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 *
 * A program that performs basic calculations between two numbers.
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-06
 */

public class PocketCalculatorApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        double div = 0.0;
        int mod = 0;

        //Keyboard Scanning Command
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please dial two numbers: ");

        //Calculations

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;


        if (num2 != 0) {
            div = (double) num1 / num2;
            mod = num1 % num2;
            System.out.printf("Div: %2f\n", div);
            System.out.printf("Mod: %d\n", mod);
        } else {
            System.out.println("Error: Division by zero!");
        }


        //Output - Results
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Sub: %d\n", sub);
        System.out.printf("Mul: %d\n", mul);

    }
}
