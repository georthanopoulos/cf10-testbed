package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Browny", 12);
        Cat cat = new Cat("Free", 8);

        dospeak(dog);
        dospeak(cat);
    }

    //Polymorphism
    public static void dospeak(Animal animal) {
        animal.speak();
    }
}
