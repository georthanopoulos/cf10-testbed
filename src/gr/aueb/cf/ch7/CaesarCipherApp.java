package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * An encryption-decryption program

 * @author G.Thanopoulos
 * @version 3.0
 * @since 02-05-2026
 */

public class CaesarCipherApp {

    public static void main(String[] args) {

        String userPureMessage;
        String userMaskedMessage;
        String encryptedMessage;
        String decryptedMessage;
        int encryptionRule;


        try (Scanner scanner = new Scanner(System.in)) {     //Read input - Keyboard Scanner

            System.out.println("Please enter your (unencrypted) message: ");   //Prompt to the user
            userPureMessage = getOneString(scanner);

            System.out.println("Please set encryption rule: ");                //Prompt to the user
            encryptionRule = Integer.parseInt(getOneString(scanner));

            encryptedMessage = encrypt(userPureMessage, encryptionRule);
            System.out.println("Message encrypted! The encrypted message is: " + encryptedMessage);

            System.out.println();

            System.out.println("Please enter your (encrypted) message: ");   //Prompt to the user
            userMaskedMessage = getOneString(scanner);

            System.out.println();

            decryptedMessage = decrypt(userMaskedMessage,  encryptionRule);

            System.out.println("Message decrypted! The decrypted message is: " + decryptedMessage);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * A method that encrypts the pure user message
     * @param plainText the string message to encrypt
     * @param cryptoKey  is the encryption key determined by the user
     * @return  the encrypted message, or null if input is null/empty
     */
    public static String encrypt(String plainText, int cryptoKey ) {

        if (plainText == null || plainText.isEmpty()) return null;

        String sdashedEnc = "";                           //Empty string for the new (encrypted) message

        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isUpperCase(plainText.charAt(i))) {
                sdashedEnc += (char)((plainText.charAt(i) - 'A' + cryptoKey + 26) % 26 + 'A');
            } else if (Character.isLowerCase(plainText.charAt(i))) {
                sdashedEnc += (char)((plainText.charAt(i) - 'a' + cryptoKey + 26) % 26 + 'a');
            } else {
                sdashedEnc += plainText.charAt(i);                  //stays as it is
            }
        }
        return sdashedEnc;
    }
    /**
     * A method that decrypts the pure user message
     * @param cipherText the string message to decrypt
     * @param cryptoKey   is the encryption key determined by the user
     * @return  the decrypted message, or null if input is null/empty
     */
    public static String decrypt(String cipherText,int cryptoKey) {

        if (cipherText == null || cipherText.isEmpty()) return null;

        String sdashedDec = "";

        for (int i = 0; i < cipherText.length(); i++) {
            if (Character.isUpperCase(cipherText.charAt(i))) {
                sdashedDec += (char)((cipherText.charAt(i) - 'A' - cryptoKey + 26) % 26 + 'A');
            } else if (Character.isLowerCase(cipherText.charAt(i))) {
                sdashedDec += (char)((cipherText.charAt(i) - 'a' - cryptoKey + 26) % 26 + 'a');
            } else {
                sdashedDec += cipherText.charAt(i);                //stays as it is
            }
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
