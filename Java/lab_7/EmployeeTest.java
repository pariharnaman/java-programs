// Main class to test the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 8000.0);
        Employee developer = new Developer("Bob", 40.0, 160);

        manager.calculateSalary();
        developer.calculateSalary();

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
    }
}