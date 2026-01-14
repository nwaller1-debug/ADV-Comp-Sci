public class Unit3Exercises {

    public static double calculateAverageStringLength(String[] strs) {
        int x = 0;
        int sum = 1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();
            } else {
                x++;
            }

        }
        return (sum - 1) / (strs.length - x);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int x = 0;
        char y = 'a';
        int left = 0;
        int right = chars.length - 1;
        if (chars[left] == chars[right]) {
            x = 1;
            y = chars[left];
        }
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]);
        }
        if (x == 1) {
            chars[0] = y;
            chars[chars.length - 1] = y;
        }
        return new String(chars);
    }

    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length();
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right - 1);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                sum = sum;
            }
        }
        if (sum == 0) {
            sum = numbers.length;
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("integer can not be negative");
        }

        int a = 0, b = 1, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int[] sortArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("any input can not be negative");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {

        int number = Integer.parseInt(str);
        if (number < 0) {
            throw new IllegalArgumentException("Input can not be negative");
        }
        return number;

    }

    public static String getArrayElement(String[] arr, int index) {
        if (arr.length < index + 1) {
            throw new IllegalArgumentException("Element was null");
        }
        return arr[index];

    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input can not be negative");
        }
        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double calculatePower(double base, int exponent) {
        if (base < 0) {
            throw new IllegalArgumentException("Input can not be negative");
        } else if (exponent < 0) {
            return 1;
        }

        return Math.pow(base, exponent);
    }

}