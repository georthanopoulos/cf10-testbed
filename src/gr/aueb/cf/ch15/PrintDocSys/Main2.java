package gr.aueb.cf.ch15.PrintDocSys;

public class Main2 {

    public static void main(String[] args) {

        Document2 doc2 = new Document2("Bravo2Zero");
        Photo2 photo2 = new Photo2("Mountain Landscape");
        Invoice invoice = new Invoice("Receipt");

        Thread thread1 = new Thread(doc2::print);
        thread1.start();

        Thread thread2 = new Thread(photo2::print);
        thread2.start();

        Thread thread3 = new Thread(invoice::print);
        thread3.start();

    }
}
