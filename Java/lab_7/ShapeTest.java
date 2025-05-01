
// Main class to test the shapes
public class ShapeTest {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5.0, 3.0);   // Rectangle with length 5 and width 3
        Shape circ = new Circle(4.0);           // Circle with radius 4

        rect.calculateArea();  // Expected: 15.0
        circ.calculateArea();  // Expected: ~50.27
    }
}
