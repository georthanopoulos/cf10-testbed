package gr.aueb.cf.ch6;

/**
 * Prints grades Percentage. Grades exist in
 * the range 0 - 10.
 */

public class GradesPercentageApp {

    public static void main(String[] args) {

        int[] grades = new int[] {6, 8, 10, 9, 7, 5, 4, 3, 1, 8, 9, 10, 6, 7, 0, 9, 0, 4, 2, 3};
        int[] counts = new int[11];

        for (int grade : grades) {
            counts[grade]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("Grade %d: %.2f%%\n", i, ((double) counts[i] / grades.length) * 100);
        }
    }
}
