public class Unit3ExercisesTester {

    public static void main(String[] args) {
        testCalculatePower();
    }

    public static void testCalculateStringLengthAverage() {
        String[] letters = { "abc", "cde", "efg", "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        try {
            letters = null;
            System.out.println("Expected exception: " +
                    Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when" +
                    " the array was null, as intended");
        }
    }

    public static void testReverseString() {
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string" +
                    " was null, as intended");
        }
    }

    public static void testFindMaxValue() {
        int[] numbs = { 1, 2, 3, 4, 5 };
        System.out.println("expected 5: " + Unit3Exercises.findMaxValue(numbs));
        numbs = new int[] { -1, -4, -3, 0, 1 };
        System.out.println("expected 1: " + Unit3Exercises.findMaxValue(numbs));
        numbs = new int[] { -1, -4, -3, -5, -2 };
        System.out.println("expected -1: " + Unit3Exercises.findMaxValue(numbs));
        numbs = new int[] {};
        try {
            numbs = new int[] {};
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(numbs));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when " +
                    "the array was null, as intended");
        }
    }

    public static void testIsPalindrome() {
        String stin = "racecar";
        System.out.println("expected true: " + Unit3Exercises.isPalindrome(stin));
        stin = "deer";
        System.out.println("expected false: " + Unit3Exercises.isPalindrome(stin));
        try {
            stin = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(stin));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the" +
                    " array was null, as intended");
        }
        try {
            stin = "";
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(stin));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when" +
                    " the array was null, as intended");
        }
    }

    public static void testSumEvenNumbers() {
        int[] numbs = { 1, 2, 3, 4, 5 };
        System.out.println("expected 6: " + Unit3Exercises.sumEvenNumbers(numbs));
        numbs = new int[] { -1, -4, -3, 0, -10 };
        System.out.println("expected -14: " + Unit3Exercises.sumEvenNumbers(numbs));
        numbs = null;
        System.out.println("expected -14: " + Unit3Exercises.sumEvenNumbers(numbs));
    }

    public static void testCalculateSumOfSquares() {
        int[] numbs = { 1, 2, 3 };
        System.out.println("exected 14:" + Unit3Exercises.calculateSumOfSquares(numbs));
        try {
            numbs = null;
            System.out.println("exected exception:" + Unit3Exercises.calculateSumOfSquares(numbs));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when" +
                    " the array was null, as intended");
        }

    }

    public static void testGetNthFibonacci() {
        int numbs = 5;
        System.out.println("exected 5:" + Unit3Exercises.getNthFibonacci(numbs));
        numbs = 10;
        System.out.println("exected 14:" + Unit3Exercises.getNthFibonacci(numbs));
        try {
            numbs = -1;
            System.out.println("exected exception:" + Unit3Exercises.getNthFibonacci(numbs));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the" +
                    " integer was negative, as intended");
        }
    }

    public static void testSortArrayDescending() {
        int[] numbs = { 1, 2, 3 };
        int[] sorted = Unit3Exercises.sortArrayDescending(numbs);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
        numbs = new int[] { -1, 2, -3 };
        sorted = Unit3Exercises.sortArrayDescending(numbs);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
        try {
            numbs = null;
            sorted = Unit3Exercises.sortArrayDescending(numbs);
            for (int i = 0; i < sorted.length; i++) {
                System.out.println(sorted[i]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when" +
                    " the array was null, as intended");
        }

    }

    public static void testFindLongestWord() {
        String stin = "The dog walks by the very large mansion";
        System.out.println("expected mansion: " + Unit3Exercises.findLongestWord(stin));
        stin = "The dog walks by the very large abode";
        System.out.println("expected abode: " + Unit3Exercises.findLongestWord(stin));
        try {
            stin = null;
            System.out.println("expected abode: " + Unit3Exercises.findLongestWord(stin));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception" +
                    "when the string was null, as intended");
        }

    }

    public static void testCalculateInterest() {
        double principal = 1.0;
        double rate = 200.0;
        int years = 5;
        System.out.println("81: " +
                Unit3Exercises.calculateInterest(principal, rate, years));
        principal = 2.0;
        rate = 200.0;
        years = 2;
        System.out.println("18: " +
                Unit3Exercises.calculateInterest(principal, rate, years));

        try {
            principal = -2.0;
            rate = -200.0;
            years = -2;
            System.out.println("18: " +
                    Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an" +
                    "exception when an input was negative, as intended");
        }
    }

    public static void testParsePositiveInteger() {
        String stin = "5";
        System.out.println("5: " + Unit3Exercises.parsePositiveInteger(stin));
        try {
            stin = "-5";
            System.out.println("5: " + Unit3Exercises.parsePositiveInteger(stin));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an" +
                    "exception when an input was negative, as intended");
        }
    }

    public static void testGetArrayElement() {
        String[] letters = { "abc", "cde", "efg", "hij" };
        System.out.println("hij: " +
                Unit3Exercises.getArrayElement(letters, 3));
        try {
            letters = new String[] { "a", "b", "c", "d", "e" };
            System.out.println("error expected: " +
                    Unit3Exercises.getArrayElement(letters, 10));
        } catch (Exception e) {
            System.out.println("the method thew an error exeption when element " +
                    "was null, as intended");

        }
    }

    public static void testCalculateSquareRoot() {
        try {
            System.out.println("error expected: " +
                    Unit3Exercises.calculateSquareRoot(-2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testSumArrayElements() {
        try {
            int[] numbs = { 1, 2, 3 };
            System.out.println("excpected 6: " +
                    Unit3Exercises.sumArrayElements(numbs));
            numbs = null;
            System.out.println("excpected 6: " +
                    Unit3Exercises.sumArrayElements(numbs));
        } catch (Exception e) {
            System.out.println("the method thew an error exeption when array " +
                    "was null, as intended");
        }
    }

    public static void testCalculatePower() {
        double base = 5;
        int exp = 2;
        System.out.println("expected 25: " + Unit3Exercises.calculatePower(base, exp));
        try {
            base = -1;
            exp = 2;
            System.out.println("expected exeption: " + Unit3Exercises.calculatePower(base, exp));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
