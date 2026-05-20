import java.util.ArrayList;

public class CombineSortedArrays {

    public void mergeSort(ArrayList<String> list1, ArrayList<String> list2) {
        for (int value : list2) {
            list1.add(findInsertLocation(value, list2));
        }
    }

    public static String toString(ArrayList<String> list) {
        String y = "";
        for (int numb : list) {
            y += numb + ", ";
        }
        return y;
    }

    public findInsertLocation(int val, ArrayList<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            
        }
        if (val > list2.get(i)) {
            
        } else if(val < list2.get(i)) {
            return i;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(1, 2, 3, 4, 5, 6, 7);
        ArrayList<Integer> list2 = new ArrayList<Integer>(11, 12, 14, 145);
        System.out.println(toString(list1));
        mergeSort(list1, list2);
        System.out.println(toString(list1));

    }
}