public class VehicleTest {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 45000, 5, "Electric", 75, 6);
        Motorcycle yamaha = new Motorcycle("Yamaha", "MT-15", 1800, 155, "Sport");

        tesla.displayDetails();
        System.out.println("---");
        yamaha.displayDetails();
    }
}