package gr.aueb.cf.ch12;

public class MathHelper {

    public static int getMax(int[] nums) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int getMin(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static double getAvg(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (double) sum / nums.length;       // cast σε double το sum only. στη διαιρεση double/int το int γινεται
    }                                            // converted αυτοματα σε double γιατι το double ειναι μεγαλυτερο state!
}
