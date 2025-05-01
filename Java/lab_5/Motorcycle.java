
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine: " + engineCapacity + "cc, Type: " + type);
    }
}
