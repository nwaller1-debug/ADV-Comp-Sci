public class Square extends Rectangle {

    public Square() {
        super(4, 4);
    }

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public String toString() {
        return super.toString() + "\nThis is also a square";
    }

}
