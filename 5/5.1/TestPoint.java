public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        // Setting new coordinates
        p1.setXY(100, 10);
        System.out.println("After setting new coordinates: " + p1);
    }
}
