package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *
 * A programme that reads the total working hours (int) and the number of employees (int),
 * calculates the number of hours that correspond to each employee as well as the remaining
 * amount of hours which will be assigned to the project manager.
 */
public class ProjectSplitApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int totalWorkingHours = 0;
        int numberOfEmployees = 0;
        int hoursAssignedToEmployees = 0;
        int hoursAssignedToPm = 0;


        //Read Input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        //Input and Data Binding

        System.out.println("Please enter the total working hours: ");   //Prompt to the user
        totalWorkingHours = scanner.nextInt();

        System.out.println("Please enter the number of employees: ");  //Prompt to the user
        numberOfEmployees = scanner.nextInt();

        //Programme Logic - Calculations
        hoursAssignedToEmployees = totalWorkingHours / numberOfEmployees;
        hoursAssignedToPm = totalWorkingHours % numberOfEmployees;

        //Programme Results - Output
        System.out.printf("Εach employee: %d hours. Remaining hours: %d hours.", hoursAssignedToEmployees, hoursAssignedToPm);

    }
}
