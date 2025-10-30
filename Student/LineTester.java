public class LineTester {
    public static void main(String[] args) {
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope(); 
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope(); 
        System.out.println(line1.toString());
        Point point1 = new Point(2, 07);
        Point point2 = new Point(3, 01);
        Point point3 = new Point(8, 10);
        Point point4 = new Point(5, 2);
        Line line3 = new Line(point1, point2);
        
    }

}
