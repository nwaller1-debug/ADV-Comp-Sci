import java.util.ArrayList;

public class StudentAnswerSheet {
    
    private String name;
    private double testScore;
    private ArrayList<String> anwsers;


    public StudentAnswerSheet(String name, ArrayList<String> anwsers) {
        if (anwsers == null) {
            throw new IllegalArgumentException("Array list can not be null");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        this.name = name;
        this.anwsers = anwsers;
        testScore = 0.0;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Array list can not be null");
        }
        if (key.size() != anwsers.size()) {
            throw new IllegalArgumentException("Anwser and key must have equal elements");
        }
        int correct = 0;
        int wrong = 0;
        int ommit = 0;
        for(int i = 0; i < anwsers.size(); i++) {
            if (key.get(i).equals(anwsers.get(i))) {
                correct++;
            } else if (anwsers.get(i).equals("?")) {
                ommit++;
            } else {
                wrong++;
            }
        }
        return ((correct) - (wrong * 0.25));
    }
    
    
    
    
    
    
    
    public ArrayList<String> getAnwsers() {
        return anwsers;
    }

    public String getName() {
        return name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setAnwsers(ArrayList<String> anwsers) {
        this.anwsers = anwsers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }
    

}
