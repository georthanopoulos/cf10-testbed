package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsSystemTwoApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        int n = 0;


        //Read input - Keyboard scanning
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please insert the desired number of stars: ");  // Prompt to the user

        //Data Binding
        n = scanner.nextInt();

        //Program Logic
        for (int i = 1; i <= n; i++) {
            System.out.println('*');
        }
    }
}
