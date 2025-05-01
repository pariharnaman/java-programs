package Coding.Java.lab_9;



class Employee {
    String name;
    int id;
    double salary;


    Employee (String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
