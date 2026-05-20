import java.util.AbstractList;
import java.util.ArrayList;

public class Word {

    private String originalWord;
    private String sortedWord;

    public Word(String ogword) {
        originalWord = ogword;
        sortedWord = sortWord(ogword);
    }

    public static String sortWord(String ogword) {
        ArrayList<Character> charList2 = new ArrayList<Character>();
        ArrayList<Character> charList = new ArrayList<Character>();
        for (int i = 0; i < ogword.length(); i++) {
            charList.add(ogword.charAt(i));
        }
        int size = charList.size();
        while (charList2.size() != size) {
            char small = '|';
            for (int i = 0; i < charList.size(); i++) {
                if (charList.get(i) < small) {
                    small = charList.get(i);
                }

            }
            charList2.add(small);
            charList.remove(small);
            small = '|';
        }
        String y = "";
        for (char charca : charList2) {
            y += charca;
        }
        System.out.println(y);
        return y;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public void setSortedWord(String sortedWord) {
        this.sortedWord = sortedWord;
    }

}
