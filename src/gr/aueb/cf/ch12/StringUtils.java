package gr.aueb.cf.ch12;

public class StringUtils {

    public static String getReverse(String str) {


        //1st Way
//        StringBuilder sb = new StringBuilder();       //manual way 1. written just for the record.
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
//        }
//        return sb.toString();


        //2nd Way
//        StringBuilder sb = new StringBuilder();      //manual way 2. written just for the record.
//
//        for (int i = 0; i < str.length(); i++) {
//            sb.append(str.charAt(i));                // χτίζω κανονικά από αρχή
//        }
//
//        sb.reverse();                                // μετά αναστρέφω
//        return sb.toString();

        return new StringBuilder(str).reverse().toString();         // 1. φτιάχνεις StringBuilder με str
                                                                    // 2. κάνεις reverse
                                                                    // 3. επιστρέφεις ως String
    }

    public static String getUppercase(String str) {

        return str.toUpperCase();                    //Δεν χρειάζεται Stringbuilder εδω. μονο οτι "build" ή "modify" θελεις "buider".
    }

    public static boolean isPalindrome(String str) {

        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
