class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is studying for exams.");
    }
}