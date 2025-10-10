public class DogTester{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Rain", "Julia", 2, 333);
        Dog dog3 = new Dog("Rex", "bob", 4, 067);
        System.out.println(PawesomeUtils.validateDogTag(dog1));
        System.out.println(PawesomeUtils.validateDogTag(dog2));
        System.out.println(PawesomeUtils.validateDogId(dog1.getDogId()));
        System.out.println(PawesomeUtils.validateDogId(dog2.getDogId()));
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.pickup(dog1, "Nick"));
        System.out.println(dog1.isStillInFacility());
        PawesomeUtils.checkIn(dog1, "Jeff");
        System.out.println(dog1.toString());
    }






}