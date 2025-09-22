public class Rectangle {
    private int width;
    private int length;
    private int area;
    private int perimeter;
    private double diagonal;


    public Rectangle() {
        length = 5;
        width = 3;
    }


    public Rectangle(int desiredlength, int desiredwidth) {
        length = desiredlength;
        width = desiredwidth;
    }

    public Rectangle(int desiredLengthWidth) {
        width = desiredLengthWidth;
        length = desiredLengthWidth;
    }

    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }

    // setter
    public void setLength(int newLength) {
        length = newLength;

    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int calculatePerimeter() {
        return perimeter = 2 * (length + width);
    }

    public int calculateArea() {
        return area = length * width;
    }

    public double calculateDiagonal() {
        return diagonal = Math.sqrt((width * width) + (length * length));
    }

    public double getDiagonal() {
        return calculateDiagonal();
    }

    public int getArea() {
        return calculateArea();

    }
    
    public int getPerimeter() {
        return calculatePerimeter();
    }

    public String toString() {
        return "This rectangle has a length of " + length + " and a width of " + width 
            + ". Its area is " + calculateArea(); 
    }
    
    public boolean equals(Rectangle otherRectangle) {
        if (
            this.length == otherRectangle.length 
                && this.width == otherRectangle.width 
                && this.area == otherRectangle.area
            ) {
            return true;
        } else {
            return false;
        }
    }
        
}   