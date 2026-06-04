package gr.aueb.cf.ch7;

public class StrPrintSubStrApp {

    public static void main(String[] args) {

        String s = "This is Sparta";

        for (int i = 0; i <s.length(); i++) {
            System.out.print(s.substring(i, i + 1));
        }
    }
}
