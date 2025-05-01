// Manager class with fixed salary
class Manager extends Employee {
    private double fixedSalary;

    public Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void calculateSalary() {
        this.salary = fixedSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + salary);
    }
}
