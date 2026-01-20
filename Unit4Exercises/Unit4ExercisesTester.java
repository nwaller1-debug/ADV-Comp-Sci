public class Unit4ExercisesTester {

    public static void main(String[] args) {
        int[] numbs = { 1, 2, 3, 4, 5, 6, 1, 2 };
        System.out.println(Unit4Exercises.matchingEndSequences(numbs, 2));
        int[] numbs1 = { 1, 1, 1, 2, 2, 3, 2, 3, 3, 2 };
        System.out.println(Unit4Exercises.hasThreeConsecutive(numbs1));
        System.out.println(Unit4Exercises.generateNumberSequence(1, 10));
        System.out.println(Unit4Exercises.fizzBuzz(1, 10));
        // System.out.println(Unit4Exercises.moveEvenBeforeOdd(numbs));

    }
}
