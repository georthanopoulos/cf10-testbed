package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 *  Voting Eligibility Criteria
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-07
 */
public class EligibleApp {

    public static void main(String[] args) {


        //Declaration and Initialization of Variables
        int age = 0;
        boolean isEligible = false;
        final int VOTING_AGE = 18;

        //Read input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        //Input - Data Binding
        System.out.println("Παρακαλώ εισάγετε την ηλικία σας: ");
        age = scanner.nextInt();

        //Programme Logic - Calculations
        isEligible = age >= VOTING_AGE;

        //Output
        System.out.println("Ψηφίζει: " + isEligible);

    }
}

