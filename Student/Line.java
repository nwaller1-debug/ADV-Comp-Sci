public class Line {
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY());
        this.b = p2.getX() - p1.getX(); 
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }
    
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }
    
    public Point getP2() {
        return p2;
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

    public boolean isCoordinateOnLine(Point p) {
        int x = p.getX();
        int y = p.getY();
        int line = (x * a) + (y * b) + c;
        if (
            line == 0
        ) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateSlopeFormula() {
        int x1 = p1.getX();
        int x2 = p2.getX();
        int y1 = p1.getY();
        int y2 = p2.getY();
        return (y2 - y1) / (x1 - x2);
    }

    public String generatePointSlopeFormula() {
        int x1 = p1.getX();
        int y1 = p1.getY();

        return "(y - " + y1 + ") = m(x - )" + x1;
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
