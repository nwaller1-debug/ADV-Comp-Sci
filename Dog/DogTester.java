public class DogTester{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.pickup(dog1, "Nick"));
        System.out.println(dog1.isStillInFacility());
        Dog.checkIn(dog1, "Jeff");
        System.out.println(dog1.toString());
    }






}