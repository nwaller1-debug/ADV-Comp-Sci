import java.util.Random;

public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        int mood = cat.getMoodLevel();
        String name = cat.getName();

        if (mood > 7 && mood <= 10) {
            return "Currently, " + name + " is in a great mood.\nPetting is appreciated.";
        } else if (mood > 3 && mood <= 7) {
            return "Currently, " + name + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + name + " is plotting revengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            int digit = Character.getNumericValue(catId.charAt(i));
            sum += digit;
        }
        int result = sum % 26;
        return (char) ('A' + result);
    }

    public static int generateRandomNumber(int low, int high) {
        if (
            low > high
            ) {
            int temp = low;
            low = high;
            high = temp;
        }
        Random rand = new Random();
        return rand.nextInt(high - low) + low;
    }

    public static String validateCatId(String catId) {
        int id = Integer.parseInt(catId);
        if (
            id >= 1000 && id <= 9999
            ) {
            return catId;
        } else {
            int randomId = generateRandomNumber(1000, 10000);
            return Integer.toString(randomId);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (
            moodLevel < 0
            ) {
                return 0;
            }
        if (
            moodLevel > 10
            ) {
                return 10;
            } else {
                return moodLevel;
            }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        int oldMood = cat.getMoodLevel();
        int newMood = oldMood;

        if (oldMood >= 2) {
            newMood++;
        } else if (
            cat.getHungry()
            ) {
            newMood--;
        } else {
            newMood++;
        }

        cat.setMoodLevel(newMood);

        if (newMood > oldMood) {
            System.out.println("Petting successful!");
        } else {
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int decrease = generateRandomNumber(1, 3); 
        int newMood = cat.getMoodLevel() - decrease;
        cat.setMoodLevel(newMood);

        if (decrease == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else {
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Done! ");
        System.out.println(cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + "'s bowl...");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Done!");
        System.out.println(cat.getName() + " is eating...");
        System.out.println(cat.getName() + " is full!");
    }
}