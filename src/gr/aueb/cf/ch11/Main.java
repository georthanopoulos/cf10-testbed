package gr.aueb.cf.ch11;

public class Main {

    public static void main(String[] args) {

        PointXYZ pointXYZ = new PointXYZ(15.3, 25.4, 35.5);

//        pointXYZ.getXYDistance();  //σωστο το καλεσμα αλλα αχρειαστο απο την στιγμη που τις εκτυπωνω πιο κατω.
//        pointXYZ.getYZDistance();
//        pointXYZ.getXZDistance();
//        pointXYZ.getXYZDistance();

        System.out.println("The distance between x and y is: " +  pointXYZ.getXYDistance());
        System.out.println("The distance between y and z is: " +  pointXYZ.getYZDistance());
        System.out.println("The distance between x and z is: " +  pointXYZ.getXZDistance());
        System.out.println("The distance between x and y and z is: " +  pointXYZ.getXYZDistance());
    }
}
