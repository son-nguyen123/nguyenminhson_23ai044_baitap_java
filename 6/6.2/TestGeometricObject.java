// Test class for GeometricObject
public class TestGeometricObject {
    public static void main(String[] args) {
        // Create a Circle object
        GeometricObject obj1 = new Circle(5.0);

        // Call methods on obj1
        System.out.println("Circle Details: " + obj1);
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPerimeter());

        // Downcasting (optional)
        Circle c1 = (Circle) obj1;
        System.out.println("Circle radius: " + c1.getRadius());
    }
}
