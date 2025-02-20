public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(6, 2);

        // Create MyRectangle instances
        MyRectangle rect1 = new MyRectangle(p1, p2);
        MyRectangle rect2 = new MyRectangle(2, 8, 7, 3);

        // Print rectangles
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Rectangle 2: " + rect2);

        // Test width, height, area, perimeter
        System.out.println("Width of Rectangle 1: " + rect1.getWidth());
        System.out.println("Height of Rectangle 1: " + rect1.getHeight());
        System.out.println("Area of Rectangle 1: " + rect1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rect1.getPerimeter());

        // Modify topLeft and bottomRight
        rect1.setTopLeft(new MyPoint(0, 6));
        rect1.setBottomRight(new MyPoint(5, 1));

        System.out.println("Updated Rectangle 1: " + rect1);
    }
}
