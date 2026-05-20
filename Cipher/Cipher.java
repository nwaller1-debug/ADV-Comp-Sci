public class Cipher {

    public static String encode(String message) {
        String y = "";
        for (int i = 0; i < message.length(); i++) {
            y = y + encodeChar(message.charAt(i));
        }
        return y;
    }

    private static char encodeChar(char c) {
        int code1 = c + 1;
        char code2 = (char) code1;
        return code2;
    }

    public static String decode(String encodedMessage) {
        String y = "";
        for (int i = 0; i < encodedMessage.length(); i++) {
            y = y + decodeChar(encodedMessage.charAt(i));
        }
        return y;
    }

    private static char decodeChar(char c) {
        int code1 = c - 1;
        char code2 = (char) code1;
        return code2;
    }

    public static String compress(String message) {
        return "";
    }

    public static String decompress(String compressedMessage) {
        return "";
    }



}
