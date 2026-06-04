package gr.aueb.cf.ch5;

/**
 * A program for temperature conversion from
 * Celsius to Fahrenheit.
 */

import java.util.Scanner;

public class CelsiusToFahrenheitApp {

    public static void main(String[] args) {

        double tempInCelsius = 0.0;
        double resultInFahrenheit = 0.0;

        //Read input - Keyboard scanner
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter temperature in Celsius: ");  //Prompt to the user

                tempInCelsius = getTemperatureInCelsius(scanner);

                resultInFahrenheit = celsiusToFahrenheit(tempInCelsius);

                System.out.println("The equivalent temperature in Fahrenheit is: " + resultInFahrenheit);

                System.out.println();
            }
        }
    }

    /**
     * A Method that receives temperature in Celsius and converts it to Fahrenheit
     * @param celsius    temp in Celsius
     * @return           converted temp to Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {

        return (celsius * (9.0 / 5.0)) + 32;
    }

    /**
     * Reads and validates a temperature value from the user input.
     * @param scanner  the Scanner object for reading input
     * @return         the validated temperature in Celsius
     */
    public static double getTemperatureInCelsius(Scanner scanner) {

        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a temperature in Celsius: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
