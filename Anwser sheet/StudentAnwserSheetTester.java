import java.util.ArrayList;

public class StudentAnwserSheetTester {

    public static void main(String[] args) {
        ArrayList<String> joeA = new ArrayList<String>();
        ArrayList<String> moeA = new ArrayList<String>();
        ArrayList<String> key = new ArrayList<String>();

        joeA.add("A");
        joeA.add("B");
        joeA.add("C");
        joeA.add("D");
        moeA.add("D");
        moeA.add("C");
        moeA.add("B");
        moeA.add("A");
        key.add("A");
        key.add("B");
        key.add("C");
        key.add("D");

        StudentAnswerSheet joe = new StudentAnswerSheet("joe", joeA);
        StudentAnswerSheet moe = new StudentAnswerSheet("moe", moeA);
        ArrayList<StudentAnswerSheet> mjoe = new ArrayList<StudentAnswerSheet>();
        mjoe.add(moe);
        mjoe.add(joe);

        TestResults class1 = new TestResults(key, mjoe);
        class1.gradeTests();
        System.out.println(joe.getTestScore());
        System.out.println(moe.getTestScore());

    }

}