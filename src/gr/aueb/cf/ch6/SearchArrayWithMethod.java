package gr.aueb.cf.ch6;

/**
 * The method returns the position of the element from the array
 * or -1 if the element is not found.
 */

public class SearchArrayWithMethod {

    public static void main(String[] args) {

        int[] quantitives = {100, 200, 300};
        int position = 0;
        int value = 200;

        position = getElementPosition(quantitives, value);


        if (position != -1) {
            System.out.println("The value " + value + " was found at position: " + position);
        } else {
            System.out.println("The value " + value + " was NOT found! Position: " + position);
        }

    }

    public static int getElementPosition(int[] arr, int value) {
        if(arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        //if value was not found
        return -1;
    }
}
