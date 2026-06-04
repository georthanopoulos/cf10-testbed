package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Guesses Bingo when user guesses the secret key correctly.
 */
public class BingoGameWhileTrueBreakApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        final int SECRET = 7;
        int inputNum = 0;

        //Read Input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please guess the key number!");   //Prompt to the user
            inputNum = scanner.nextInt();                         //Data Binding

            if (inputNum == SECRET) {
                System.out.println("Bingo!!! Great guess!!!!");
                break;
            } else {
                System.out.println("Unfortunately your guess was mistaken! Try again!!!");
            }

        }
    }
}
