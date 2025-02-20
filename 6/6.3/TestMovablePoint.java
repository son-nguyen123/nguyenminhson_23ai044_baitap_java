// Test class for MovablePoint
public class TestMovablePoint {
    public static void main(String[] args) {
        // Create a MovablePoint instance
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point); // Initial position

        point.moveUp();
        System.out.println("After moveUp: " + point);

        point.moveRight();
        System.out.println("After moveRight: " + point);

        point.moveDown();
        System.out.println("After moveDown: " + point);

        point.moveLeft();
        System.out.println("After moveLeft: " + point);
    }
}
