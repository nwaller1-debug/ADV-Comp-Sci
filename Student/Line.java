public class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public void setC(int c) {
        this.c = c;
    }
    
    public int getA() {
        return a;
    }
    
    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public double calculateSlope() {
        double slope = (double) (-1 * a) / (double) b;
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        int line = (x * a) + (y * b) + c;
        if (
            line == 0
        ) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return a + "x " + b + "y " + c + " = 0";
    }


    public boolean isEqual(Line otherLine) {
        if (
            this.a == otherLine.a 
                && this.b == otherLine.b 
                && this.c == otherLine.c
        ) {
            return true;
        } else {
            return false;
        }
    }

}
