package gr.aueb.cf.ch4;

public class For2App {

    public static void main(String[] args) {

        // Print out - 1st line 10, 2nd line 9, 3rd line 8,.....10th line 1
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
