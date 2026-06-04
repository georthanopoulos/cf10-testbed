package gr.aueb.cf.ch10;

public class Main {

    public static void main(String[] args) {

        User user = new User(9946821, "Bob", "Lalakis");


        System.out.println("-----Println με overloaded constructor-----");
        System.out.println("User id: " + user.getId());
        System.out.println("User firstname: " + user.getFirstname());
        System.out.println("User lastname: " + user.getLastname());
    }
}
