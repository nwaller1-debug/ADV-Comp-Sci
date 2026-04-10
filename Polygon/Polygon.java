public abstract class Polygon {

    private int numberOfSides;
    

    public Polygon(int sides) {
        numberOfSides = sides;
    }
    
    public abstract double getArea();
        
    

    public String toString() {
        return "This is a polygon";
    }

}