public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    
    // getters
    // to-do: implement getters
    // to-do: implement getTestScore

    // inherited methods
    // to-do: implement toString

    // methods

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int[] getScores() {
        return scores;
    }



    public void setScores(int[] scores) {
        this.scores = scores;
    }



    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public int getTestScore(int testNumber) {
        if (
            testNumber < 0 || testNumber >= scores.length
        ) {
            return -1;
        } else {
            return scores[testNumber];
        }
    }
    
    public double getAverage(int first, int last) {
        double count = 0;
        double total = 0;
        for (int i = first; i < last; i++) {
            total = total + scores[i];
            count++;
        }
        double average = total / count;
        return average;
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (
                scores[i] < scores[i - 1]
            ) {
                return false;
            } 
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        double average = 0;
        double count = 0;
        if (
            hasImproved()
        ) {
            for (int i = scores.length / 2; i < scores.length; i++) {
                average = average + scores[i];
                count++;
            }
        } else {
            for (int i = 0; i < scores.length; i++) {
                average = average + scores[i];
                count++;
            }
        }
        double total = average / count;
        return total;
    }

    public String toString() {
        String result = name + "'s scores: [";

        for (int i = 0; i < scores.length; i++) {
            result += scores[i];
            if (
                i < scores.length - 1
            ) {
                result += ", ";
            }
        }

        result += "]";
        return result;
    }

    public boolean equals(StudentRecord other) {
        for (int i = 0; i < scores.length; i++) {
            if (
                this.scores[i] != other.scores[i]
            ) {
                return false;
            }
        }
        if (
            name.equals(other.name)
        ) {
            return true;
        } else {
            return false;
        }
    }

}