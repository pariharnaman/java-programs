public class Circle extends MathConstants {
    public void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // Attempting to override displayPI() here would cause a compile-time error.
    // @Override
    // void displayPI() { } // ❌ Cannot override final method

    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayPI();
        c.calculateArea(5);

        // c.PI = 3.14; // ❌ Cannot assign a value to final variable
    }
}
