public class Unit3ExercisesTester {

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
    }

    public static void testCalculateStringLengthAverage() {
        String[] letters = { "abc", "cde", "efg", "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        try {
            letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

    }

}
