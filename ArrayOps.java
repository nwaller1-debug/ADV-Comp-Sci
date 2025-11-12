public class ArrayOps {
    public static String printStringArray(String [] fruits) {
        String list = "[";
        for (int i = 0; i < fruits.length; i++) {
            if (
                i == fruits.length -1
            ) {
                list = list + fruits[i];
            } else {
                list = list + fruits[i] + ", ";
            }
            
        }
        list = list + "]";
        System.out.println(list);
        return list;

    }

    public static String printIntegerArray(int [] numbs) {
        String list = "[";
        for (int i = 0; i < numbs.length; i++) {
            if (
                i == numbs.length -1
            ) {
                list = list + numbs[i];
            } else {
                list = list + numbs[i] + ", ";
            }
            
        }
        list = list + "]";
        System.out.println(list);
        return list;

    }

    public static int findMax(int [] numbs) {
        for (int i = 0; i < numbs.length; i++) {

        }
    }
        // just do the same thing you did for the previous 2

}