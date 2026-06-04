package gr.aueb.cf.ch8;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class SimpleBankApp {

    static double balance = 500.0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        in.useLocale(Locale.US);             // Αυτή η γραμμή λέει στο πρόγραμμα να δέχεται τελεία (.)
                                            // γιατί αλλιως θα με παει με το συστημα μου που ειναι Ελληνικα
                                            //και θα πρεπει οταν το τρεχω να βαζω κομμα αντι για τελεια!
        double amount = 0.0;

        System.out.println("Welcome to the simple bank!");


        try {
            System.out.println("Please enter the amount you would like to deposit:");
            amount = getOneDouble();
            deposit(amount);
            System.out.println("Your new balance is: " + balance);

            System.out.println("Please enter the amount you would like to deposit:");
            amount = getOneDouble();
            withdraw(amount);
            System.out.println("Your new balance is: " + balance);
        } catch (Exception e) {
            System.err.println("Something went wrong. Please try again." + e.getMessage());
        }


    }

    public static void deposit(double amount) throws Exception {

        try {
            if (amount < 0) throw new Exception("Deposit amount must be positive!");
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception {

        try {
            if (amount < 0) throw new Exception("Withdrawal amount must be positive!");
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }

    public static double getOneDouble() {
        return in.nextDouble();
    }

}
