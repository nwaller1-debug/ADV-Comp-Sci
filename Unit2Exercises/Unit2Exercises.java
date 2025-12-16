public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if ((day == 0 || day == 6) & vacation) {
            return "off";
        } else if ((day == 0 || day == 6) || vacation) {
            return "10:00";
        } else {
            return "7:00";
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || (a - b) == 6 || (b - a) == 6) {
            return true;
        } else {
            return false;
        }

    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        if (str.length() > 0 && str.indexOf('f') == 0 && str.indexOf('b') != str.length() - 1) {
            return "Fizz";
        } else if (str.length() > 0 && str.indexOf('b') == str.length() - 1
                && str.indexOf('f') != 0) {
            return "Buzz";
        } else if (str.length() > 0 && str.indexOf('f') == 0
                && str.indexOf('b') == str.length() - 1) {
            return "FizzBuzz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        String y = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String x = str.substring(i, i + 1);
            y = y + x + x;
        }
        return y;

    }

    public static int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;

    }

    public static boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cats++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogs++;
            }
        }

        return cats == dogs;
    }

    public static String mixString(String a, String b) {
        String result = "";
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.substring(i, i + 1) + b.substring(i, i + 1);
        }

        return result + a.substring(min) + b.substring(min);
    }

    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            str.substring(str.length());
            result += end;
        }
        return result;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.equals("")) {
            return true;
        }
        for (int i = 0; i < b.length(); i++) {
            if (a.equals(b.substring(i))) {
                return true;
            }
        }
        return false;

    }

    public static int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co")
                    && str.substring(i + 3, i + 4).equals("e")) {
                count++;
            }
        }

        return count;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                count++;
            }

        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++; // skip next number
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;

    }

    public static boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;

    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;

    }

    public static int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int zeros = 0;

        for (int n : nums) {
            if (n == 0) {
                zeros++;
            }
        }

        int index = zeros;
        for (int n : nums) {
            if (n != 0) {
                arr[index] = n;
                index++;
            }
        }
        return arr;

    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        int j = 0;
        for (String w : words) {
            if (!w.equals(target)) {
                count++;
            }
        }
        String[] result = new String[count];
        for (String w : words) {
            if (!w.equals(target)) {
                result[j++] = w;
            }
        }
        return result;
    }

    public static int scoresAverage(int[] scores) {
        int half = scores.length / 2;
        return Math.max(
                average(scores, 0, half),
                average(scores, half, scores.length));
    }

    private static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);

    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                x = a[i];
            }
            for (int z = 0; z < b.length; z++) {
                if (b[z] % 10 == 0) {
                    y = b[z];
                }
            }

        }
        return x + y;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str.charAt(0) + "*";
        }
        return "**";

    }

    public static double divide(int a, int b) {
        double big = Math.max(a, b);
        double small = Math.min(a, b);
        if (big == 0 || small == 0) {
            return 0;
        }
        return big / small;
    }
}
