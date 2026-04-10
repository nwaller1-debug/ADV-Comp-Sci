public class Rectangle extends Polygon {

    private double width;
    private double length;

    public Rectangle() {
        super(4);
        width = 3.0;
        length = 4.0;

    }

    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return super.toString()
                + "\nIt is a rectangle with length of " + length + " and width of "
                + width + ". It's area is " + getArea();
    }
}
