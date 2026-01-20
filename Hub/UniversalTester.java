public class UniversalTester {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Nick@", "1282", "nwaller1@gmail.com");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick", "1282", "nwaller2@gmail.com");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick1", "1282", "nwaller2@gmail.com");
            s2.changeName("Nick@");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick", "1282", "nwaller2@gmail.com");
            s2.changeName("Nick");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student(null, "1282", "nwaller2@gmail.com");
            s2.resetPassword();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("nick", null, "nwaller2@gmail.com");
            s2.resetPassword();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick1444444", "1282", "nwaller2@gmail.com");
            s2.submitAssignment(null, null);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick4", "1282", "nwaller2@gmail.com");
            s2.submitAssignment("a", null);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick1222", "1282", "nwaller2@gmail.com");
            s2.submitAssignment("math1", "wewew1");
            s2.submitAssignment("math2", "wewew2");
            s2.submitAssignment("math3", "wewew3");
            s2.submitAssignment("math4", "wewew45");
            s2.submitAssignment("math5", "wewew6");
            s2.submitAssignment("math6", "wewew7");

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Student s2 = new Student("Nick5", "1282", "nwall@gmail.com", 1);
            s2.submitAssignment("asaa", "adsa");

        } catch (Exception e) {
            System.out.println(e);

        }
        try {
            Student s2 = new Student("nick0", "1282", "nwaller2@gmail.com");
            s2.resetPassword1();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Hub h1 = new Hub();
            h1.doesStudentExist(null);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Hub h1 = new Hub();
            h1.registerStudent("nick100", "22111", "nwaller1@gmail.com");
            h1.doesStudentExist("nick100");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Hub h1 = new Hub();
            h1.registerStudent("nick1001", "22111", "nwaller1@gmail.com");
            h1.loginStudent("nick12222121", "121");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Hub h1 = new Hub();
            h1.registerStudent("nick1021", "22111", "nwaller1@gmail.com");
            h1.loginStudent("nick1021", "121");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Hub h1 = new Hub1();
            h1.doesStudentExist(" a");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
