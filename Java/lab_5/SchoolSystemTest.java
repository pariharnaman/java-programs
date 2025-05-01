public class SchoolSystemTest {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Aarav"),
            new Teacher("Mrs. Sharma"),
            new Student("Kiara"),
            new Teacher("Mr. Verma")
        };

        for (Person p : people) {
            p.performDuty(); // Runtime polymorphism in action
        }
    }
}