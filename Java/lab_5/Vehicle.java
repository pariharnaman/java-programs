class Vehicle {
    String brand, model;
    double price;

    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Vehicle: " + brand + " " + model + ", Price: $" + price);
    }
}
