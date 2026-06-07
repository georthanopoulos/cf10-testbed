package gr.aueb.cf.ch15;

public interface Printable {

     default void print() {
         System.out.println(this);
     }
}
