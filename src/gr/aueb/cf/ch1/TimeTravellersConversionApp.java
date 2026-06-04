package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * A program that converts time (in Years) to Months,
 * Weeks, Days, Hours, Min and Secs.
 *
 * The calculation is based on a 365-days year. The leap year scenario is not applicable!
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-05
 */

public class TimeTravellersConversionApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int years = 0;
        int totalMonths = 0;
        int totalWeeks = 0;
        int totalDays = 0;
        int totalHours = 0;
        int totalMinutes = 0;
        int totalSeconds = 0;
        int remainingDays = 0;
        final int DAYS_PER_YEAR = 365;
        final int MONTHS_IN_YEAR = 12;
        final int DAYS_PER_WEEK = 7;
        final int HOURS_PER_DAY = 24;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_MINUTE = 60;

        //Keyboard Scanning Command
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please insert the desired amount of time in years:");  //Prompt to User

        //Import Data Written to The System from Keyboard

        years = scanner.nextInt();

        //Program Logic and Calculations

        totalMonths = years * MONTHS_IN_YEAR ;
        totalDays = years * DAYS_PER_YEAR;
        totalWeeks = totalDays / DAYS_PER_WEEK;
        remainingDays = totalDays % DAYS_PER_WEEK;
        totalHours = totalDays * HOURS_PER_DAY;
        totalMinutes = totalHours * MINUTES_PER_HOUR;
        totalSeconds = totalMinutes * SECONDS_PER_MINUTE;

        // Outputs the Converted amount of Time (in years) to Months, Weeks, Days, Hours,
        // Minutes and Seconds.

        System.out.printf(" %d years correspond to: %d months %d weeks %d days %d hours %d minutes and %d seconds based on a 365-days year.\n WARNING: Leap year scenario not applicable.",
                years, totalMonths, totalWeeks, remainingDays,
                totalHours, totalMinutes, totalSeconds);




    }
}
