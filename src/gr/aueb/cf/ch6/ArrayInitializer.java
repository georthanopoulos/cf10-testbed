package gr.aueb.cf.ch6;

public class ArrayInitializer {

    public static void main(String[] args) {

        int[] arr1 = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] arr2;
        arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }

            System.out.println(" ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
