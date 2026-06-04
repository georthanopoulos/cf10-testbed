package gr.aueb.cf.ch4;

public class DecApp {

    public static void main(String[] args) {

        //Declaration and Initialization of Variables
        char ch1 = 'a';
        char ch2 = '*';

        //Output - Printed Results
        System.out.println("ch1 =" + ch1);
        System.out.println("ch1 =" + (int)ch1);

        System.out.println("ch2 =" + ch2); // Use %c for chars printing and use %d for integer (ordinal number) printing
        System.out.println("ch2 =" + (int)ch2);

        System.out.printf("%c = %d ordinal %n", ch1, (int)ch1);
        System.out.printf("%c = %d ordinal %n", ch2, (int)ch2);
    }
}
