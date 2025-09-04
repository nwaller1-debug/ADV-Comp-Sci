public class Rectangle {
    private int width;
    private int length;
    private int area;



    public Rectangle() {
        length = 5;
        width = 3;
        area = 15;
    }


    public Rectangle(int desiredlength, int desiredwidth){
        length = desiredlength;
        width = desiredwidth;
    }

    public Rectangle(int desiredLengthWidth){
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
    public void setLength(int newLength){
        length = newLength;

    }

    public void setWidth(int newWidth){
        width = newWidth;
    }

    public int calculateArea() {
        return area = length * width;
    }
}   
