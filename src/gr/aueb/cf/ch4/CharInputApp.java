package gr.aueb.cf.ch4;

import java.io.IOException;

public class CharInputApp {

    public static void main(String[] args) throws IOException {

        //Declaration and Initialization of Variables
        int inputChar = ' ';  // ' ' returns the ordinal value of the char

        System.out.println("Please insert an ASCII char");  //Prompt to the user

        //Program Logic
        inputChar = System.in.read();   //reads one byte as int

        //Output - Printed Results
        System.out.println("char: " + (char) inputChar);
    }
}
