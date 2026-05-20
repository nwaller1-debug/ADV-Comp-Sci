import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {

    private ArrayList<Word> wordList;

    public AnagramList() {
        this.wordList = new ArrayList<Word>();

    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1.getSortedWord().equals(word2.getSortedWord())) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> temp = new ArrayList<Word>();
        String sortedKey = Word.sortWord(key);
        for (Word word : wordList) {
            if (word.getSortedWord().equals(sortedKey)) {
                temp.add(word);
            }
        }
        return temp;

    }

    public Word get(int index) {
        return wordList.get(index);
    }

    public int size() {
        return wordList.size();
    }

}
