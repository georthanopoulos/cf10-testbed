package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Guesses repeatedly until the key will eventually be
 * found. This method of repeated guesses in
 * cryptography, for guessing passwords or cryptographic
 * keys, is called brute-force.
 */
public class BingoGameDoWhileApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        final int KEY = 10;
        int inputNum = 0;
        boolean bingo = false;

        //Read Input - Keyboard Scanning
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please guess the KEY number!");   //Prompt to the user
            inputNum = scanner.nextInt();                         //Data Binding

            if (inputNum == KEY) {
                bingo = true; //Should the guess is correct we set bingo to true to exit the loop and terminate the game.
                System.out.println("Bingo!!! Great guess!!!!");
            } else {
                System.out.println("Unfortunately your guess was mistaken! Try again!!!");
            }

        }  while (!bingo);

    }
}
