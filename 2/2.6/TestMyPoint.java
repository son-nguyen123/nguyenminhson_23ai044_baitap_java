public class TestMyPoint {
    public static void main(String[] args) {
        // Test default constructor
        MyPoint p1 = new MyPoint();
        System.out.println(p1);  // Expected output: (0, 0)

        // Test setters and getters
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Expected: 8
        System.out.println("y is: " + p1.getY()); // Expected: 6

        // Test setXY() and getXY()
        p1.setXY(3, 0);
        int[] coords = p1.getXY();
        System.out.println("x: " + coords[0]); // Expected: 3
        System.out.println("y: " + coords[1]); // Expected: 0
        System.out.println(p1); // Expected: (3, 0)

        // Test overloaded constructor
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);  // Expected: (0, 4)

        // Test distance() methods
        System.out.println(p1.distance(p2));  // Distance between (3,0) and (0,4)
        System.out.println(p2.distance(p1));  // Should be the same as above
        System.out.println(p1.distance(5, 6)); // Distance between (3,0) and (5,6)
        System.out.println(p1.distance());  // Distance from (3,0) to (0,0)

        // Allocate an array of MyPoint objects
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Print all the points
        for (MyPoint point : points) {
            System.out.println(point);
        }
    }
}
