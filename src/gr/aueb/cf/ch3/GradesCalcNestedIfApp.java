package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται ώς είσοδο: 1)Σύνολο βαθμολογίας και
 * 2) πλήθος μαθημάτων και υπολογίζει τον μέσο όρο. Στη συνέχεια
 * δίνει feedback στομ χρήστη: 9-10 Άριστα, 7-8 Καλώς
 * και 5-6 Λίαν καλώς, κάτω απο 5 Αποτυχία.
 */
public class GradesCalcNestedIfApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int modulesCount;
        int average = 0;
        int totalGrades = 0;

        //Read input - Keyboard Scanning

        Scanner scanner = new Scanner(System.in);

        //Programme Logic
        System.out.println("Please insert the sum of grades");       //Prompt to thε user
        totalGrades = scanner.nextInt();                             //Data Binding

        System.out.println("Please insert the number of modules");   //Prompt to thε user
        modulesCount = scanner.nextInt();                            //Data Binding

        if (modulesCount == 0) {
            System.out.println("The number of modules cannot be zero!");
            System.exit(1);
        }

        //Calculations
        average = totalGrades / modulesCount;

        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }
        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >= 7) {
            System.out.println("Very Good: " + average);
        } else if (average >=5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Fail: " + average);
        }
    }
}
