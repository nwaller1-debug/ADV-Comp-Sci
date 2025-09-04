public class RectangleTester {
    public static void main(String[] args) {
        // Declaration: type name
        // Instantiation/initialization = new type();
        Rectangle joe = new Rectangle();
        Rectangle moe = new Rectangle();
        Rectangle curly = new Rectangle();
        Rectangle olivia = new Rectangle(6, 7);
        Rectangle samuel = new Rectangle(4, 10);
        Rectangle stout = new Rectangle(8);
    
    
    
    System.out.println(joe.getWidth());
    System.out.println(olivia.getLength());
    System.out.println(stout.getLength());
    stout.setLength(12);
    System.out.println(stout.getLength());
    System.out.println(samuel.calculateArea());
}

}
