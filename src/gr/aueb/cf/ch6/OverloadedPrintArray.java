package gr.aueb.cf.ch6;

/**
 * Κάνουμε invoke τις υπερφορτωμένες εκδόσεις μέσα στην main.
 */

public class OverloadedPrintArray {

    public static void main(String[] args) {
        int[] arr = {20, 25, 30, 33, 45, 19, 90, 55};


        printArray(arr, 0, arr.length - 1);

        System.out.println();

        findMinMaxValues(arr);
    }

/**
 * Μπορούμε να υπερφορτώσουμε (overload) την printArray()
 * με διαφορετικές τυπικές παραμέτρους, ώστε να μπορεί να εκτυπώνει
 * όχι μόνο ολόκληρο τον πίνακα όπως η προηγούμενη printArray(int[]arr)
 * αλλά και μέρος του πίνακα, από low μέχρι high.
 */

    public static void printArray(int[] arr, int low, int high) {
        if ((low < 0) || (high > arr.length - 1)) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findMinMaxValues(int[] arr) {

        int maxIndex = 0;   //Supposing that max is at position 0.
        int minIndex = 0;   //Supposing that min is at position 0.

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;       //We found new max (value), we keep its position.
            }

            if (arr[i] < arr[minIndex]) {
                minIndex = i;      //We found new min (value), we keep its position.
            }
        }
        System.out.println("Max τιμή: " + arr[maxIndex] + " στη θέση: " + maxIndex);
        System.out.println("Min τιμή: " + arr[minIndex] + " στη θέση: " + minIndex);
    }
}
