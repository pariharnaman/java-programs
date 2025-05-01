class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    private static int totalEmployees = 0;

    // Default constructor
    Employee() {
        this.employeeID = 0;
        this.name = "Not Assigned";
        this.department = "General";
        this.salary = 0.0;
        totalEmployees++;
    }

    // Parameterized constructor
    Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("ID: " + employeeID + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public double getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Alice", "IT", 55000);
        Employee e3 = new Employee(102, "Bob", "HR", 50000);

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
        e3.displayEmployeeInfo();

        displayTotalEmployees();
    }
}
