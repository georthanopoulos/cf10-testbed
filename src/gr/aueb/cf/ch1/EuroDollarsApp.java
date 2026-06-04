package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Euro To USD Converter.
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-05
 */

public class EuroDollarsApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int inputEuros = 0;
        int usaCents = 0;
        int usaDollars = 0;
        int totalUsaCents = 0;
        final int PARITY = 99;                         //USA Cents

        //Keyboard Scanning Command
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert an amount (in Euros):");   //Prompt to User

        //Import Data Written to The System from Keyboard
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Outputs the Converted amount of Euros in Dollars
        System.out.printf("%d euros = %d usa cents = %d usa dollars & %d usa cents",
                inputEuros, totalUsaCents, usaDollars, usaCents);



    }
}
