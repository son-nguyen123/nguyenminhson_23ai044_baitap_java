public class TestMyCircle {
    public static void main(String[] args) {
        // Test constructors
        MyCircle c1 = new MyCircle();
        System.out.println(c1);  // Default circle

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);

        MyPoint p = new MyPoint(7, 8);
        MyCircle c3 = new MyCircle(p, 6);
        System.out.println(c3);

        // Test getters and setters
        c1.setRadius(10);
        c1.setCenterXY(5, 5);
        System.out.println("Updated c1: " + c1);

        System.out.println("c1 Center: (" + c1.getCenterX() + ", " + c1.getCenterY() + ")");
        System.out.println("c1 Radius: " + c1.getRadius());

        // Test area and circumference
        System.out.println("c1 Area: " + c1.getArea());
        System.out.println("c1 Circumference: " + c1.getCircumference());

        // Test distance between two circles
        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}
