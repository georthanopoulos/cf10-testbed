package gr.aueb.cf.ch4;

public class Test2 {

    public static void main(String[] args) {
        int count = 0;
        final int MAX_COUNT = 100;

        for(;;) {
            System.out.print("Forever");
            count++;
            if (count % 10 == 0) {
                System.out.println(); // New line every 10 iterations
            } else if (count == MAX_COUNT) {
                break;
            }
        }
    }
}
