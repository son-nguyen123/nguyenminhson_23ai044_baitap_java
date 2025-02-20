// Rectangle class
class Rectangle {
    private float length;
    private float width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // Constructor with parameters
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public float getLength() {
        return length;
    }

    // Setter for length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter for width
    public float getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate area
    public float getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public float getPerimeter() {
        return 2 * (length + width);
    }

    // toString() method
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}

// TestMain class
public class onedotthree {
    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // default constructor
        System.out.println(r2);

        // Test setters and getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
