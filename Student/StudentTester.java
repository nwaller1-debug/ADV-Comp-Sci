public class StudentTester {
    public static void main(String[] args) {
        Student student0 = new Student("Nick", 10);
        Student student1 = new Student("Nick", 10);
        Student student2 = new Student("Atrain");
        student0.setId(student1.getId());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student0));
        System.out.println(student1.equals(student2));

    }
}