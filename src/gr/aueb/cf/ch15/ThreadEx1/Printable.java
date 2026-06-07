package gr.aueb.cf.ch15.ThreadEx1;

public interface Printable {

     default void print() {
         System.out.println(this);
     }
}
