public class TriangleLoops {

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String output = "";
        for (int i = 0; i <= numberOfRows; i++) {
            for (int a = 0; a < i; a++ ) {
                output += letter;
            }
            output = output + "\n";
        }
        return output;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String output = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int a = 0; a <= numberOfRows - i; a++) {
                output += letter;
            }
            output = output + "\n";
        }
        return output;
    }

    public static String createAlphabetTriangle(int numberRows) {
        String output = "";
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (
            numberRows > 26
        ) {
            numberRows = 25;
        }
        for (int i = 0; i <= numberRows; i++) {
            for (int c = numberRows - i; c > 0; c--) {
                output += " ";
            }
            for (int a = 0; a <= i; a++) {
                output += alph.charAt(a);
            }
            for(int b = i;b > 0;b--) {
                output += alph.charAt(b - 1);
            }
                output += "\n";
            }
        
        return output;
    }


    

}