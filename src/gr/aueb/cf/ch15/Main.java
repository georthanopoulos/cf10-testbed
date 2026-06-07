package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {

        Document doc = new Document();
        Photo phot = new Photo();
        Book bok = new Book();

//        //Lambda method
//        Thread thread1 = new Thread(() -> doc.print());
//        thread1.start();
//
//        Thread thread2 = new Thread(() -> phot.print());
//        thread2.start();
//
//        Thread thread3 = new Thread(() -> bok.print());
//        thread3.start();

        //Method Reference
        new Thread(doc::print).start();

        new Thread(phot::print).start();

        new Thread(bok::print).start();
    }
}
