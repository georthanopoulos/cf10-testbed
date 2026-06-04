package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * An encryption-decryption program

 * @author G.Thanopoulos
 * @version 2.0
 * @since 02-05-2026
 */

public class EncryptDecryptApp {

    public static void main(String[] args) {

        String userPureMessage;
        String userMaskedMessage;
        String encryptedMessage;
        String decryptedMessage;


        try (Scanner scanner = new Scanner(System.in)) {     //Read input - Keyboard Scanner

            System.out.println("Please enter your (unencrypted) message: ");   //Prompt to the user
            userPureMessage = getOneString(scanner);

            encryptedMessage = encrypt(userPureMessage);

            System.out.println("Message encrypted! The encrypted message is: " + encryptedMessage);

            System.out.println();

            System.out.println("Please enter your (encrypted) message: ");   //Prompt to the user
            userMaskedMessage = getOneString(scanner);

            decryptedMessage = decrypt(userMaskedMessage);

            System.out.println("Message decrypted! The decrypted message is: " + decryptedMessage);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * A method that encrypts the pure user message
     * @param s the string message to encrypt
     * @return  the encrypted message, or null if input is null/empty
     */
    public static String encrypt(String s) {

        if (s == null || s.isEmpty()) return null;

        String sdashedEnc = "";                           //Empty string for the new (encrypted) message

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'Z') {
                sdashedEnc += 'A';
            } else if (s.charAt(i) == 'z') {
                sdashedEnc += 'a';
            } else {

                sdashedEnc += (char) (s.charAt(i) + 1);
            }
        }
        return sdashedEnc;
    }
    /**
     * A method that decrypts the pure user message
     * @param s the string message to decrypt
     * @return  the decrypted message, or null if input is null/empty
     */
    public static String decrypt(String s) {

        if (s == null || s.isEmpty()) return null;

        String sdashedDec = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                sdashedDec += 'Z';
            } else if (s.charAt(i) == 'a') {
                sdashedDec += 'z';
            } else
                sdashedDec += (char) (s.charAt(i) - 1);
        }
        return sdashedDec;
    }

    /**
     * A method for data binding of the user input
     * @param scanner    keyboard scanning for collecting user input data
     * @return           data binding - user input message
     */
    public static String getOneString(Scanner scanner) {

        while (!scanner.hasNextLine()) {
            System.out.println("Invalid input! Please try again! ");
            scanner.nextLine();
        }

        return scanner.nextLine();
    }
}
