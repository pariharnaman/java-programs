class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is teaching students.");
    }
}