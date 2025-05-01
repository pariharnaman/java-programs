
class ElectricCar extends Car {
    int batteryCapacity; // in kWh
    int chargingTime;    // in hours

    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + "kWh, Charging Time: " + chargingTime + "h");
    }
}