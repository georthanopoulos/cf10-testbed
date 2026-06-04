package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 *A programme that converts integer Fahrenheit temperature in Celsius scale.
 * The programme will print / output the relevant message and will also read
 * the integer temperature from the user.
 * The conversion in Celsius scale will be performed according to the
 * formula (5/9)(F-32) -- which equally can be formulated as (5 * (F-32)) / 9.
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-07
 **/

public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables

        int Fahrenheit = 0;
        int Celsius = 0;

        //Read input - keyboard scanning
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert temperature in Fahrenheit: ");

        //Input and Data Binding
        Fahrenheit = scanner.nextInt();

        //Programme Logic
        Celsius = (5 * (Fahrenheit - 32)) / 9;

        //Output - Resulting Data
        System.out.printf("The correspondant temperature in Celsius is: %d", Celsius);
    }
}
