public class PoolUtils {

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (
            cleanlinessLevel > 10
        ) {
            cleanlinessLevel = 10;
        } else if (
            cleanlinessLevel < 0
        ) {
            cleanlinessLevel = 0;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        int space = name.indexOf(' ');
        String first = name.substring(0, space);
        String last = name.substring(space + 1);
        int numb = (int) ((Math.random()) * 100) + 1950;
        return "@" + first + "_" + last + "_" + numb;
    }
    
    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel(pool.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String newName = name.trim();
        int space = newName.indexOf(' ');
        String first = newName.substring(0, space + 1);
        String last = name.substring(space + 1);
        String r = first.toLowerCase();
        String g = last.toLowerCase();
        String fixName = r + "" + g;
        return fixName;
    }
}