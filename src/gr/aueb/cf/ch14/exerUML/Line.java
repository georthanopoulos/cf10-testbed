package gr.aueb.cf.ch14.exerUML;

public class Line extends AbstractShape {

    private double length;

    public Line() {

    }

    public Line(double length) {
        this.length = length;
    }

    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
