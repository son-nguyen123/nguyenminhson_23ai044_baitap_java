// Circle class implementing GeometricObject
public class Circle implements GeometricObject {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override getArea() method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString() method
    @Override
    public String toString() {
        return "Circle with radius=" + radius + ", area=" + getArea() + ", perimeter=" + getPerimeter();
    }
}
