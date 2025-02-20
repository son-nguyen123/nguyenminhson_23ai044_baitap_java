public class Cylinder extends Circle {
    private double height;

    // Constructor with default radius, color, and height
    public Cylinder() {
        super();  // Calls Circle's default constructor
        this.height = 1.0;
    }

    // Constructor with height, default radius and color
    public Cylinder(double height) {
        super();  // Calls Circle's default constructor
        this.height = height;
    }

    // Constructor with radius and height, default color
    public Cylinder(double radius, double height) {
        super(radius);  // Calls Circle's constructor with radius
        this.height = height;
    }

    // Constructor with radius, height, and color
    public Cylinder(double radius, double height, String color) {
        super(radius, color);  // Calls Circle's constructor with radius and color
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Overridden method to calculate the surface area of the cylinder
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();  // Surface Area
    }

    // Method to calculate the volume
    public double getVolume() {
        return super.getArea() * height;  // Uses base area from Circle
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
