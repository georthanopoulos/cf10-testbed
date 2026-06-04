package gr.aueb.cf.ch6;

public class ArrayPopulate {

    public static void main(String[] args) {

        //Version1 sized init

        //Array declaration and initialization
        int[] ages = new int[5];

        //Populate Array
        ages[0] = 20;
        ages[1] = 40;
        ages[2] = 27;
        ages[3] = 17;
        ages[4] = 22;

        //Print the array elements
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        //Version2 unsized init

        //Initialize and populate the array
        int[] ages2 = {19, 20, 23, 22, 30};

        //Print the array elements
        for (int i = 0; i < ages2.length; i++) {
            System.out.print(ages2[i] + " ");
        }
    }
}
