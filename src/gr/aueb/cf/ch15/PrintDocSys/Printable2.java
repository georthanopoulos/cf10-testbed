package gr.aueb.cf.ch15.PrintDocSys;

public interface Printable2 {

    default void print() {
        System.out.println(this);
    }
}
