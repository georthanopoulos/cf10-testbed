package gr.aueb.cf.ch15.ThreadEx1;

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
        Thread thread1 = new Thread(doc::print);
        thread1.start();

        Thread thread2 = new Thread(phot::print);
        thread2.start();

        Thread thread3 = new Thread(bok::print);
        thread3.start();
    }
}
