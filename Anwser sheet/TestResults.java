import java.util.ArrayList;

public class TestResults {

    ArrayList<String> anwserKey;
    ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null) {
            throw new IllegalArgumentException("array list can not be null");
        }
        if (submissions == null) {
            throw new IllegalArgumentException("array list can not be null");
        }
        this.anwserKey = key;
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet tests : submissions) {
            tests.setTestScore(tests.getGrade(anwserKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions == null || submissions.size() == 0) {
            return "";
        }
        double x = 0.0;
        String y = "";
        for (StudentAnswerSheet tests : submissions) {
            if (tests.getTestScore() > x) {
                x = tests.getTestScore();
                y = tests.getName();
            }
        }
        return y;
    }

    public ArrayList<String> getAnwserKey() {
        return anwserKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setAnwserKey(ArrayList<String> anwserKey) {
        this.anwserKey = anwserKey;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

}