package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Generic Nested version of while
 */
public class GenericNestedWhileApp {

    public static void main(String[] args) {

        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;
        int i = 1;
        final int TIMES = 3;

        Scanner scanner = new Scanner(System.in);

        while (i <= TIMES) {
            count = 0;
            System.out.println("Please insert start, end, step values");
            start = scanner.nextInt();
            end = scanner.nextInt();
            step = scanner.nextInt();
            while (start <= end) {
                count++;
                start += step;
            }

            System.out.println("Count = " + count);
            i++;
        }
    }
}
