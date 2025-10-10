public class PawesomeUtils {
    
    public static void checkIn(Dog dog, String personName) {
        dog.setName(personName);
        dog.setStillInFacility(true);
    }
    
    public static char generateDogChar(int dogId) {
        return (char) ('f' + (dogId / 100) + ((dogId % 100) / 10) + ((dogId % 100) % 10));
    }
    
    public static String pickup(Dog dog, String personName) {
        if (
            dog.getOwnerName().equals(personName)
        ) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName();
        }
        else {
            return "You cannot take the dog because you are not its owner";
        }
    }
    public static String generateDogTag(int dogid, char dogChar) {
        return dogChar + "" + (dogid);
    }

    public static int validateDogId(int dogId) {
        if (
            dogId >= 100 & dogId <= 999
        ) {
            return dogId;
        } else {
            return (int) ((Math.random() + 0.1) * 1000);
        }
    }
    
    public static boolean validateDogTag(Dog dog) {
        char newDogChar = generateDogChar(PawesomeUtils.validateDogId(dog.getDogId()));
        int extraDogId = PawesomeUtils.validateDogId(dog.getDogId());
        System.out.println(extraDogId);
        System.out.println(newDogChar);
        String newDogTag = PawesomeUtils.generateDogTag(extraDogId, newDogChar);
        System.out.println(newDogTag);
        if (
            newDogTag.equals(dog.getDogtag())
        ) {
            System.out.println(newDogTag);
            System.out.println(dog.getDogtag());
            System.out.println(dog.getDogId());
            return true;
        } else {
            System.out.println(newDogTag);
            System.out.println(dog.getDogId());
            return false;
        }
    }


}
