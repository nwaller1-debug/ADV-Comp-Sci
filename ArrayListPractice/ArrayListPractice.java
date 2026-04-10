import java.util.ArrayList;

public class ArrayListPractice {

    public static int countOddLength(ArrayList<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null.");
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int countOddLengthForEachLoop(ArrayList<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("Array list can not be null");
        }
        int x = 0;
        for (String string : list) {
            if (string.length() % 2 != 0) {
                x++;
            }
        }
        return x;
    }

    public static void removeStrings(ArrayList<String> list, char firstLetter) {
        if (list == null) {
            throw new IllegalArgumentException("Array list can not be null");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 0 && list.get(i).charAt(0) == firstLetter) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeStrings2(ArrayList<String> list, char firstLetter) {
        if (list == null) {
            throw new IllegalArgumentException("Array list can not be null");
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() > 0 && list.get(i).charAt(0) == firstLetter) {
                list.remove(i);
            }
        }
    }

    public static int numCount(ArrayList<Integer> list, int number) {
        if (list == null) {
            throw new IllegalArgumentException("Array list can not be null");
        }
        int x = 0;
        for (int numb : list) {
            if (numb == number) {
                x++;
            }
        }
        return x;
    }

}
