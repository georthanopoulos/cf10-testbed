package gr.aueb.cf.ch6;

/**
 * Διασχίζει και εκτυπώνει
 * τα στοιχεία ενός πίνακα με for-each.
 */

public class ForEachLoop {

    public static void main(String[] args) {

        int[] ages = {19, 29, 22, 40 };        //unsized init


        //FOR - EACH
        // είναι παρόμοια με την κλασσική FOR αλλά πιο ασφαλής στις περιπτώσεις
        // που δεν χρειαζόμαστε τη θέση κάθε στοιχείου αλλά το στοιχείο καθαυτό.
        //Σημαίνει πως για κάθε τιμή - age τύπου int -μέσα στον πίνακα ages εκτύπωσε κάθε τιμή.
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
