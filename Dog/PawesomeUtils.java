public class PawesomeUtils {
    
    public static void checkIn(Dog dog, String personName) {
        dog.setName(personName);
        dog.setStillInFacility(true);
    }
    
    public static char generateDogChar(int dogId) {
        return (char) ('F' + (((dogId / 100) + ((dogId % 100) / 10) + ((dogId % 100) % 10)) % 10));
    }
    
    public static String pickup(Dog dog, String personName) {
        if (
            dog.getOwnerName().equals(personName)
        ) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName();
        } else {
            return "You cannot take the dog because you are not its owner";
        }
    }
    
    public static String generateDogTag(int dogid, char dogChar) {
        return dogid + "" + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (
            dogId >= 100 & dogId <= 999
        ) {
            return dogId;
        } else {
            return (int) ((Math.random()) * 900) + 100;
        }
    }
    
    public static boolean validateDogTag(Dog dog) {
        int extraDogId = dog.getDogId();
        char newDogChar = generateDogChar(extraDogId);
        String newDogTag = "" + extraDogId + newDogChar;
        if (
            newDogTag.equals(dog.getDogTag())
        ) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (
            dog.getAge() <= 2
        ) {
            return 15 + ((dog.getAge() - 1) * 9);
        } else {
            return 24 + ((dog.getAge() - 2) * 5);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (
            humanYears <= 15
        ) {
            return 1;
        } else if (
            humanYears > 15 & humanYears <= 24
        ) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }
    


}
