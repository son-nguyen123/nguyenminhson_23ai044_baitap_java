public class Cylinder {
    private Circle base; // Composition: Cylinder has a Circle as its base
    private double height;

    // Default constructor
    public Cylinder() {
        base = new Circle(); // Initialize default circle
        height = 1.0;
    }

    // Constructor with specified radius and default height
    public Cylinder(double radius) {
        base = new Circle(radius); 
        height = 1.0;
    }

    // Constructor with specified radius and height
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    // Constructor with specified radius, height, and color
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    // Getters
    public double getRadius() {
        return base.getRadius();
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return base.getColor();
    }

    // Setters
    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    // Calculate volume of the cylinder
    public double getVolume() {
        return base.getArea() * height;
    }

    // toString method
    @Override
    public String toString() {
        return "Cylinder [base=" + base + ", height=" + height + "]";
    }
}
