public class ArrayOps {
    public static String printStringArray(String [] fruits) {
        String list = "[";
        for (int i = 0; i < fruits.length; i++) {
            if (
                i == fruits.length - 1
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
                i == numbs.length - 1
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
        if (numbs == null) {
            return 0;
        }
        int x = numbs[0];
        for (int i = 0; i < numbs.length; i++) {
            if (
                x <= numbs[i]
            ) {
                x = numbs[i];
            } 

        }
        return x;
    }

    public static String findLongestString(String [] strings) {
        if (
             strings == null
        ) { 
            return "";
        }
        
        String x = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (
                strings[i] != null && x.length() < strings[i].length() 
            ) {
                x = strings[i];
            }
        }
        return x;
    }


    public static double averageStringLength(String [] strings) {
        if (
             strings == null
        ) {
            return 0;
        }
        double y = 0;
        double x = 0;
        int z = 0;
        for (int i = 0; i < strings.length; i++) {
            if (
                strings[i] == null
            ) {
                z = z + 1;
            } else {
                x = strings[i].length();
                y = y + x;
            }
        }
        if (
            strings.length - z <= 0
        ) {
            y = 0;
        } else {
            y = (double) y / (double) (strings.length - z);
        }
        return y;
    }

    public static int [] countLetterFrequencies(String string) {
        if (string == null) {
            return new int[0];
        }
        int y = 0;
        int [] ints = new int[26];
        String alph = "abcdefghijklmnopqrstuvwxyz";
        alph = alph.toLowerCase();
        string = string.toLowerCase();
        for (int i = 0; i < 26; i++) {
            for (int x = 0; x < string.length(); x++) {
                if (
                    string.substring(x, x + 1).equals(alph.substring(i, i + 1))
                ) {
                    y = y + 1;
                }
            }
            ints[i] = y;
            y = 0;
        }
        return ints;
    }

    public static int[] removeIntAndScoot(int [] ints, int rem) {
        if (ints == null) {
            return new int[0];
        }
        int [] integ = new int[ints.length];
        for (int i = 0; i < integ.length - 1; i++) {
            if (
                i < rem
            ) {
                integ[i] = ints[i]; 
            } else {
                integ[i] = ints[i + 1];
            }
        
        }
        return integ;
    }

    public static int [] resizeIntArray(int [] ints) {
        if (ints == null) {
            return new int[0];
        }
        int [] integ = new int[ints.length * 2];
        for (int i = 0; i < integ.length; i++) {
            if (
                i < ints.length
            ) {
                integ[i] = ints[i];
            } else {
                integ[i] = 0;
            }
             
        }
        return integ;
    }

    public static String [] addNumToStringArray(String [] string) {
        if (
            string == null
        ) {
            return new String[0];
        }
        
        String [] strin = new String[string.length];
        for (int i = 0; i < string.length; i++) {
            String x = string[i];
            if (
                x == null
            ) {
                string[i] = null;
            } else {
                strin[i] = "#" + i + " " + x;
            }
        }
        return strin;
    }

    public static int [] reverseIntArray(int [] ints) {
        if (ints == null) {
            return new int[0];
        }
        int [] integ = new int[ints.length];
        int x = ints.length - 1;
        for (int i = 0; i < ints.length; i++) {
            integ[i] = ints[x];
            x--;
        }
        return integ;
    }

}