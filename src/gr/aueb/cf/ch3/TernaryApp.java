package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute of an int,
 * that is abs(num) = num (if num is positive)
 * or -num if num is negative.
 */

public class TernaryApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int num1 = 0;
        int abs = 0;

        //Read input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a num1");   //Prompt to th user
        num1 = scanner.nextInt();                     //Data Binding

        //Logic
        abs = (num1 >= 0) ? num1 : -num1;

        //Output - Print
        System.out.printf("Abs of %d is %d\n ", num1 , abs);
    }
}
