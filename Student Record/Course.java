public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        enrolledStudents = new StudentRecord[maxEnrollment];
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                if (enrolledStudents[i].equals(student)) {
                    enrolledStudents[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int x = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                x++;
            }
        }
        return x;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        int x = enrolledStudents.length;
        StudentRecord[] ogArray = enrolledStudents.clone();
        this.enrolledStudents = new StudentRecord[x + sizeIncrease];
        for (int i = 0; i < x; i++) {
            enrolledStudents[i] = ogArray[i];
        }

    }

    public String toString() {
        String output = "== " + courseName + " ==\n";

        for (int i = 0; i < enrolledStudents.length; i++) {
            output += (i + 1) + ".) " + enrolledStudents[i].toString();
            output += "\n";

        }

        return output;
    }

    public String findBestStudent() {
        double best = -1;
        String bestName = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            double avg = enrolledStudents[i].getFinalAverage();
            if (avg > best) {
                best = avg;
                bestName = enrolledStudents[i].getName();
            }
        }

        return bestName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public double calculateTestAverage(int testNum) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            int score = enrolledStudents[i].getTestScore(testNum);
            if (score != -1) {
                sum += score;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
}

// getters
// to-do: implement getters

// setters
// to-do: implement setters

// inherited methods

// to-do: implement toString

// methods

/*
 * Iterates through the enrolledStudents array and returns the name of the
 * student with the best final average.
 * 
 * @return the name of the student with the best final average
 */
// to-do: implement findBestStudent

/*
 * Iterates through the enrolledStudents array and returns the average of the
 * specified test number.
 * 
 * @return a double representing the average of the specified test number
 */
// to-do: implement calculateTestAverage
