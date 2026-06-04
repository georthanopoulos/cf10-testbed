package gr.aueb.cf.ch7;
/**
 * A program that performs the tasks described below:
 * 1. Element count of an array. (Done by method)
 * 2. Even elements filtering (and printing through main). (Done by Method)
 * 3. Mapping each element of the array by double. (Method returns array)
 * 4. Checking for at least one positive number. (Method returns boolean)
 * 5. Checking whether all the elements of the array are positive or not. (Method returns boolean)
 *
 * @author George Thanopoulos
 * @version 1.0
 * @since 01-05-2026
 */

import java.util.Arrays;

public class ArrayMultiTinyProjects {

    public static void main(String[] args) {

        int[] arr = {-5, 12, 10, -9, 7, 5, 10, 25};
        int counter = 0;
        int valueNum = 10;
        int[] mapped = new int[arr.length];
        boolean anyPositive = false;
        boolean allPositive = false;

        counter = elemCount(arr, valueNum);
        System.out.println("The count of elements in the array is: " + counter);

        System.out.println();

        System.out.print("Even elements: ");
        printEvenFiltering(arr);

        System.out.println();

        mapped = elemMapToDouble(arr);
        System.out.println("The mapped array is: " + Arrays.toString(mapped));

        anyPositive = isAnyPositive(arr);
        System.out.println("Any positive is: " + anyPositive);

        allPositive = areAllPositive(arr);
        System.out.println("All positive is: " + allPositive);




    }

    /**
     * Calculates the count of times an element
     * exists in the array.
     * @param arr      to search through the input array
     * @param value    the value to count in the array
     * @return         the count of occurrences of the value in the array,
     *                 or -1 if the array is null.
     */
    public static int elemCount(int[] arr, int value) {

        if (arr == null || arr.length == 0) return -1;   //Array does not exist

        int count = 0;

        for (int element : arr) {
            if (element == value) {
                count++;
            }
        }
        return count;

    }

    /**
     * The Method filters the elements of the array and prints the even ones
     * @param arr    the arr to be filtered
     */
    public static void printEvenFiltering (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * The method performs mapping of the array for each element by double.
     * @param arr   the array to be mapped
     * @return  the mapped array with each element doubled, or empty array if invalid
     */
    public static int[] elemMapToDouble (int[] arr) {

        if (arr == null || arr.length == 0) return new int[0];

        int[] mappedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mappedArr[i] = arr[i] * 2;
        }
            return mappedArr;
    }

    /**
     * The method that examines whether there is any positive element in the array arr.
     * @param arr   the array to check
     * @return  true if at least one positive element exists, false otherwise
     */
    public static boolean isAnyPositive (int[] arr) {

        if (arr == null || arr.length == 0) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return true;
            }
        }
        return false;
    }
    /**
     * The method that examines whether every element of the array is positive.
     * @param arr   the array to check
     * @return  true if all existing elements are positive.
     * */
    public static boolean areAllPositive (int[] arr) {

        if (arr == null || arr.length == 0) return false;

        for (int element : arr) {
            if (element < 0) return false;               //early exit
        }
        return true;
    }
}
