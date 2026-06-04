package gr.aueb.cf.ch12;

public class MainCheck {

    public static void main(String[] args) {

        String str1 = "Marafeti";
        int[] nums = {5, 3, 8, 1, 9, 2, 12, 2};

//        StringUtils.getReverse(str1);      //can be ignored due to the fact that I print them below either way
//        StringUtils.getUppercase(str1);
//        StringUtils.isPalindrome(str1);

        System.out.println("The reverse of the string is: " + StringUtils.getReverse(str1));
        System.out.println("The uppercase version of the string is: " + StringUtils.getUppercase(str1));
        System.out.println("Is this string Palindrome?: " + StringUtils.isPalindrome(str1));
        System.out.println();
        System.out.println();


//        MathHelper.getMax(nums);          //can be ignored due to the fact that I print them below either way
//        MathHelper.getMin(nums);
//        MathHelper.getAvg(nums);

        System.out.println("The maximum number of the array is: " + MathHelper.getMax(nums));
        System.out.println("The minimum number of the array is: " + MathHelper.getMin(nums));
        System.out.println("The average number of the array is: " + MathHelper.getAvg(nums));

    }
}
