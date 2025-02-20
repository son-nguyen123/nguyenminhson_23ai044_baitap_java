public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Circle circle2 = new Circle(2.5, "blue", true);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(4.0, 5.0, "yellow", false);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        Square square1 = new Square();
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        Square square2 = new Square(3.0, "purple", true);
        System.out.println(square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());

        square2.setSide(5.0);
        System.out.println("After setting side to 5.0: " + square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
    }
}
