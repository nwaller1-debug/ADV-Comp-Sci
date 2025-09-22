public class LineTester {
    public static void main(String[] args) {
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope(); 
        boolean onLine1 = line1.isCoordinateOnLine(5, -2); 
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope(); 
        boolean onLine2 = line2.isCoordinateOnLine(5, -2); 
        System.out.println(line1.toString());
    }

}
