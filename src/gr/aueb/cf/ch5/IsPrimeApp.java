package gr.aueb.cf.ch5;

import java.util.Scanner;

public class IsPrimeApp {

    public static void main(String[] args) {

        int inputNumber = 0;
        boolean result = false;

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                System.out.print("Please enter a number: ");
                inputNumber = getANumber(scanner);

                result = isPrime(inputNumber);

                System.out.println(result);
                System.out.println();
            }
        }

    }

    public static boolean isPrime(int num) {

        if (num <= 1)  return false;

        //for (int i = 2; i <= Math.sqrt(num); i++)   //Εναλλακτικη επιλογη

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return  false;
        }
        return true;
    }

    public static int getANumber(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
