public class Unit3Exercises {

    public static double calculateAverageStringLength(String[] strs) {
        int sum = 1;
        for (int i = 1; i < strs.length; i++) {
            sum += strs[i - 1].length();
            if (i % 2 == 0) {
                sum = sum - 1;
            }
        }
        return sum / (strs.length + 1);
    }
}