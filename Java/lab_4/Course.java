class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void displayCourse() {
        System.out.println("Course Name: " + courseName + ", Code: " + courseCode);
    }

    public static void main(String[] args) {
        Course c = new Course("Data Structures", "CS201");
        c.displayCourse();
    }
}
