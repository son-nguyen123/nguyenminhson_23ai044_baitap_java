public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with specified radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor with specified radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Calculate area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
