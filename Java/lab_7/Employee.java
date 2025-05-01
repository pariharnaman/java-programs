// Abstract class
abstract class Employee {
    protected String name;
    protected String role;
    protected double salary;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Abstract methods
    public abstract void calculateSalary();
    public abstract void displayDetails();
}