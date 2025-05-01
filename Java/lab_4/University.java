class University {
    static String universityName = "Tech University";
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }

    void displayStudentInfo() {
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {
        University.displayUniversityName();
        University s1 = new University("John");
        University s2 = new University("Emma");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
