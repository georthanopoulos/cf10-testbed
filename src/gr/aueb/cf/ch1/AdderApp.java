package gr.aueb.cf.ch1;


/**
 *  AdderApp Class implements the addition of two integer variables,
 *  then saves the result and prints out the result of their sum
 *  to the console
 *
 * @author Giorgio
 * @version 1.0
 */
public class AdderApp {

    public static void main(String[] args) {

        // Section 1: Stating and Initialization of values
        int num1 = 19;
        int num2 = 30;
        int sum = 0;

        // Section 2: Data processing
        sum = num1 + num2;

        //Section 3: Printed result
        System.out.println("To αποτέλεσμα της πρόσθεσης είναι ίσο με: " + sum);
    }
}
