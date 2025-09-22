public class RectangleTester {
    public static void main(String[] args) {
        // Declaration: type name
        // Instantiation/initialization = new type();
        Rectangle recone = new Rectangle();
        Rectangle rectwo = new Rectangle();
        
        System.out.println((recone.toString()));
        System.out.println((rectwo.toString()));
        recone.setLength(10);
        recone.setWidth(5);
        rectwo.setWidth(4);
        rectwo.setLength(6);
        System.out.println((recone.toString()));
        System.out.println((rectwo.toString()));
        
        if (recone.equals(rectwo)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
        System.out.println("The diagonal is " + recone.calculateDiagonal());
        System.out.println("The diagonal is " + rectwo.calculateDiagonal());
    }

}
