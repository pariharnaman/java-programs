class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seating: " + seatingCapacity + ", Fuel: " + fuelType);
    }
}