public class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle() {
        super(3);
        base = 3.0;
        height = 4.0;
    }

    public Triangle(double base, double height) {
        super(3);
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public String toString() {
        return super.toString()
                + "\nIt is a triangle with base of " + base + " and height of "
                + height + ". It's area is " + getArea();
    }
}
