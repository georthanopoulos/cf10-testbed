package gr.aueb.cf.ch5;

import java.util.Scanner;

public class SquareApp {

    public static void main(String[] args) {

        int inputNumber = 0;
        int result = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                System.out.print("Please enter a number: ");
                inputNumber = getANumber(scanner);

                result = square(inputNumber);

                System.out.println(result);
                System.out.println();
            }
        }
    }

    public static int square(int num) {

        return num * num;
    }

    public static int getANumber(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please try again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
