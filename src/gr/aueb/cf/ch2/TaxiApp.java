package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *Μια εταιρεία ταξί χρεώνει σταθερό κόστος εκκίνησης 3€ (300 λεπτά) και 0,74€ (74 λεπτά) ανά χιλιόμετρο.
 *Να γραφεί πρόγραμμα που διαβάζει την απόσταση σε ακέραια χιλιόμετρα και υπολογίζει το συνολικό κόστος.
 *Το αποτέλεσμα να εκτυπώνεται σε ευρώ και λεπτά ξεχωριστά.
 *
 * @author Giorgio
 * @version 1.0
 * @since 2026-04-07
 */

public class TaxiApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int distanceInKm = 0;
        int totalCostPerRide = 0;
        int euros = 0;
        int cents = 0;
        final int CENTS_TO_EUROS = 100;
        final int EXTRA_COST_PER_KM = 74;
        final int FIXED_STARTING_COST = 300;

        //Read Input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total distance in Kilometers: ");    //Prompt to the user

        //Input and Data Binding
        distanceInKm = scanner.nextInt();

        //Programme Logic - Calculations
        totalCostPerRide = (FIXED_STARTING_COST + (EXTRA_COST_PER_KM * distanceInKm));
        euros = totalCostPerRide / CENTS_TO_EUROS;
        cents = totalCostPerRide % CENTS_TO_EUROS;

        //Output - Resulting Cost in Euros and Cents
        System.out.printf("The final calculated cost is: %d euros and %d cents", euros , cents);

    }
}

