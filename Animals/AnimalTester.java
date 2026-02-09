public class AnimalTester {

    public static void main(String[] args) {
        Elephant john = new Elephant();
        Fly joe = new Fly();
        System.out.println(john.toString());
        System.out.println(joe.toString());
        joe.paintFly("blue");
        john.getOlder();
        System.out.println(john.toString());
        System.out.println(joe.toString());
    }
}
