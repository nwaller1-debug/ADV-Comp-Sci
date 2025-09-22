public class Student {
    
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }
    
    public void setName(String n) {
        name = n;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public String generateId() {
        int randomNum1 = (int) (Math.random() * 8 + 1);
        int randomNum2 = (int) (Math.random() * 8 + 1);
        int randomNum3 = (int) (Math.random() * 8 + 1);
        int randomNum4 = (int) (Math.random() * 10);
        int randomNum5 = (int) (Math.random() * 10);
        int randomNum6 = (int) (Math.random() * 10);
        int randomNum7 = (int) (Math.random() * 10);
        return "" + randomNum1 + randomNum2 + randomNum3 + "-" 
            + randomNum4 + randomNum5 + randomNum6 + randomNum7;
    }


    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id;
    }


    public boolean equals(Student otherStudent) {
        if (
            this.name.equals(otherStudent.name)
                && this.grade == otherStudent.grade
                && this.id.equals(otherStudent.id)
        ) {
            return true;
        } else {
            return false;
        }
    }

}



