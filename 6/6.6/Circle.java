// Circle class implementing GeometricObject
public class Circle implements GeometricObject {
    protected double radius;  // Protected variable for subclass access

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Implement getArea() method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString() method
    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}
