public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // The following line would cause an error because s1 is a Shape, not a Circle
        // System.out.println(s1.getRadius()); // ERROR: getRadius() is not in Shape

        Circle c1 = (Circle) s1;  // Downcast back to Circle
        System.out.println(c1.getRadius());

        // The following line would cause an error because Shape is abstract
        // Shape s2 = new Shape(); // ERROR: Cannot instantiate abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);  // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());

        // The following line would cause an error because s3 is a Shape, not a Rectangle
        // System.out.println(s3.getLength()); // ERROR: getLength() is not in Shape

        Rectangle r1 = (Rectangle) s3;  // Downcast
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);  // Upcast Square to Shape
        System.out.println(s4);

        // The following line would cause an error because getSide() is not in Shape
        // System.out.println(s4.getSide()); // ERROR: getSide() is not in Shape

        Rectangle r2 = (Rectangle) s4;  // Downcast Square to Rectangle
        System.out.println(r2.getLength()); // Works fine
        // System.out.println(r2.getSide()); // ERROR: getSide() is not in Rectangle

        Square sq1 = (Square) r2; // Downcast Rectangle to Square
        System.out.println(sq1.getSide()); // Works fine
    }
}
