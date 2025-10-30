public class TriangleLoops {

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        if (
            numberOfRows <= 0
            ) {
            return "";
        }

        String result = "";
        for (
            int i = 1; i <= numberOfRows; i++
        ) {
            for (
                int j = 1; j <= i; j++
            ) {
                result += letter;
            }
            if (
                i < numberOfRows
                ) {
                result += "\n";
            }
        }
        return result;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        if (
            numberOfRows <= 0
            ) {
            return "";
        }

        String result = "";
        for (
            int i = numberOfRows; i >= 1; i--
        ) {
            for (
                int j = 1; j <= i; j++
            ) {
                result += letter;
            }
            if (
                i > 1
                ) {
                result += "\n";
            }

        }
        return result;
    }
    
    public static String createNumbersTriangle(int numberOfRows) {
        if (
            numberOfRows <= 0
            ) {
            return "";
        }

        String result = "";
        for (
            int i = 1; i <= numberOfRows; i++
        ) {
            for (
                int j = 1; j <= i; j++
            ) {
                result += i;
                if (
                    j < i
                ) {
                    result += " ";
                }
            }
            if (
                i < numberOfRows
                ) {
                result += "\n";
            }

        }
        return result;
    }
    
    public static String createAlphabetTriangle(int numberOfRows) {
        if (
            numberOfRows <= 0
            ) {
            return "";
        }
        if (
            numberOfRows > 26
            ) {
            numberOfRows = 26;
        }

        String result = "";

        for (
            int i = 1; i <= numberOfRows; i++
        ) {
            for (
                int s = i; s < numberOfRows; s++
            ) {
                result += " ";
            }
            for (
                int j = 0; j < i; j++
            ) {
                result += (char) ('A' + j);
            }
            for (
                int j = i - 2; j >= 0; j--
            ) {
                result += (char) ('A' + j);
            }

            if (
                i < numberOfRows
                ) {
                result += "\n";
            }
        }

        return result;
    }
}
