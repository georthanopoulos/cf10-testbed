package gr.aueb.cf.ch15.PrintDocSys;

public class Photo2 implements Printable2 {

    String photoName;

    public Photo2() {

    }

    public Photo2(String photoName) {
        this.photoName = photoName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Override
    public String toString() {
        return "Photo name is: " + photoName;
    }

    @Override
    public void print() {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(this);
    }
}
