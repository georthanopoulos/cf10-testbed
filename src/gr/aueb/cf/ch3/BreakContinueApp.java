package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break και
 * continue.
 *
 * @author Giorgio
 * @version 1.0
 * @since 09-04-2026
 */
public class BreakContinueApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int num = 0;
        int sum = 0;

        //Read Input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        //Program Logic - Calculations
        while (true) {
            System.out.println("Please provide a num: ");     //Prompt to the user
            num = scanner.nextInt();                          //Data Binding

            //If the number is 5, ignore it
            //and immediately continue to next loop.
            if (num ==5) {
                continue;
            }
            sum += num;

               //If the number equals 10 then
               //stop immediately the loop
               //and get out of while.
               if (num ==10) {
                   break;
               }

        }
        System.out.println ("Sum: " + sum);
    }
}
