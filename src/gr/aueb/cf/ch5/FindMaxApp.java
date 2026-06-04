package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FindMaxApp {

    public static void main(String[] args) {

        int inputNum1 = 0;
        int inputNum2 = 0;
        int inputNum3 = 0;
        int result = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                System.out.println("Enter 3 numbers for comparison.");
                System.out.print("Enter first number: ");
                inputNum1 = getANumber(scanner);
                System.out.print("Enter second number: ");
                inputNum2 = getANumber(scanner);
                System.out.print("Enter third number: ");
                inputNum3 = getANumber(scanner);

                result = findMax(inputNum1, inputNum2, inputNum3);

                System.out.println("The maximum number out of three is: " + result);
                System.out.println();
            }
        }

    }

    public static int findMax(int num1, int num2, int num3) {

        return Math.max(num1, Math.max(num2, num3));
    }

    public static int getANumber(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
