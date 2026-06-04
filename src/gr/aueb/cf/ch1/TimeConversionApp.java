package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * A program that converts time in minutes and seconds.
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-05
 */

public class TimeConversionApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int hours = 0;
        int totalTimeInSec = 0;
        int totalTimeInMin = 0;
        final int MIN_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = 3600;


        //Keyboard Scanning Command
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a magnitude of time (in Hours):");  //Prompt to User

        //Import Data Written to The System from Keyboard
         hours = scanner.nextInt();

         //Program Logic and Calculations

         totalTimeInSec = hours * SECONDS_PER_HOUR;
         totalTimeInMin = totalTimeInSec / MIN_PER_HOUR;


        // Outputs the Converted amount of Time (in hours) to Minutes and Seconds
        System.out.printf("%d hours = %d minutes & %d seconds",
                hours, totalTimeInMin, totalTimeInSec);
    }

}
