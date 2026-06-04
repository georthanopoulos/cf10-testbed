package gr.aueb.cf.ch4;

/**
 * ξεχωριστες και αυτοτελείς if! διαβαζονται και ελεγχονται ξεχωριστα ΚΑΙ οι δυο!
 * Εδω μπορουμε να κανουμε τετοιο ειδους χρηση της If και ειναι προαιρετικα τα {}.
 * Ωστοσο οταν υπάρχει λογικη συνδεση μεταξυ των ελεγων πχ. classification βαθμων
 * τοτε πρεπει να χρησιμοποιηθει η κανονικα if της οποιας τα if s ειναι αλληλοεξαρτώμενα
 * τα επομενα απο τα προηγουμενα! ΠΡΟΣΟΧΗ ΛΟΙΠΟΝ!
 */

public class Test1 {

    public static void main(String[] args) {
        int count = 0;
        final int MAX_COUNT = 100;

        for(;;) {
            System.out.print("Forever");
            count++;
            if (count % 10 == 0) System.out.println(); // New line every 10 iterations
            if (count == MAX_COUNT) break;
        }
    }
}
