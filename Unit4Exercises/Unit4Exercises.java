public class Unit4Exercises {

    public static boolean matchingEndSequences(int[] numbs, int n) {
        int count = 0;
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = numbs[(numbs.length) - n];

        }
        for (int i = 0; i < n; i++) {
            for (int z = 0; i < n; i++) {
                if (copy[i] == numbs[z]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasThreeConsecutive(int[] numbs) {
        int z = 0;
        int x = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                x++;
                z = 0;
            } else if (numbs[i] % 2 == 1) {
                z++;
                x = 0;
            }
            if (z == 3 || x == 3) {
                return true;
            }
        }
        return false;
    }

    public static int[] generateNumberSequence(int start, int end) {
        int[] copy = new int[end - start];
        for (int i = 0; i < (end - start); i++) {
            copy[i] = start + i;
        }
        return copy;
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] copy = new String[end];
        for (int i = 0; i < (end - start); i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                copy[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                copy[i] = "Fizz";
            } else if (i % 5 == 0) {
                copy[i] = "Buzz";
            } else {
                copy[i] = String.valueOf(start + i);
            }
        }
        return copy;
    }

    public static int[] moveEvenBeforeOdd(int[] numbs) {
        int z = 0;
        int x = 0;
        int[] copy = new int[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                z++;
            } else {
                x++;
            }
        }
        int[] odd = new int[z];
        int[] even = new int[x];
        for (int i = 0; i < even.length; i++) {
            copy[i] = even[i];
        }
        int c = even.length;
        for (int i = 0; i < even.length; i++) {
            copy[c] = odd[i];
        }
        return copy;
    }
}
