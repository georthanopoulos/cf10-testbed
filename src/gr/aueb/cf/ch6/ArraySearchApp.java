package gr.aueb.cf.ch6;

/**
 * Searches for a key number in an array of ints
 */

public class ArraySearchApp {

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 9, 10, 15};
        final int KEY = 10;
        boolean keyIsFound = false;

        for (int item : arr) {
            if (item == KEY){
                keyIsFound = true;
                break;
            }
        }
        if (keyIsFound) {
            System.out.println ("Key was found");
        }else {
            System.out.println("Key was NOT found");
        }
    }
}
