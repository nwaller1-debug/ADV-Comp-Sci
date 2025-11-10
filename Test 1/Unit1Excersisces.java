public class Unit1Excersisces {
    

    public String helloname(String name) {
        return "hello " + name + "!";
    }

    public String makeOutWord(String outline, String word) {
        return outline.substring(0,1) + word + outline.substring(2, 3);
    }

    public String withoutEnd(String word) {
        int length = word.length();
        return word.substring(1,length - 1);
    }

    public String comboString(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (
            length1 > length2
        ) {
            return word2 + word1 + word2;
        } else {
            return word1 + word2 + word1;
        }
    }

    public String left2(String word) {
        String first2 = word.substring(0,1);
        return word.substring(2) + first2;
    }


    public String middleThree(String word) {
        int length1 = word.length();
        int length = (word.length() - 3) / 2;
        return word.substring(length, length1 - length);
    }

    public String withoutEnd2(String word) {
        int length = word.length();
        return word.substring(1, length - 1);
    }

    public String stringEnds(String word, int numb) {
        int length = word.length();
        return word.substring(numb, length - numb);
    }
    public boolean hasBad(String word) {
        int badDetect = word.indexOf("bad");
        if (
            badDetect > 0 &&
            badDetect < 2
        ) {
            return true;
        } else {
            return false;
        }
    }

    public int countrVowels(String word) {
        int vowelCount = 0;
        String vowels = "aeiou";
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char locate = word.charAt(i);
            if (
                vowels.indexOf(locate) > -1
            ) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public int countCode(String word) {
        int codeCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (
                word.charAt(i) == 'c' &&
                word.charAt(i + 1) == 'o' &&
                word.charAt(i + 3) == 'e'
            ) {
                codeCount++;
            }
        }
        return codeCount;
    }
}
