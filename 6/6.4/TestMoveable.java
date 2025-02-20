// Test class for Moveable objects
public class TestMoveable {
    public static void main(String[] args) {
        // Test MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        point.moveUp();
        System.out.println("After moveUp: " + point);
        point.moveRight();
        System.out.println("After moveRight: " + point);

        // Test MovableCircle
        MovableCircle circle = new MovableCircle(5, 5, 1, 2, 10);
        System.out.println(circle);
        circle.moveDown();
        System.out.println("After moveDown: " + circle);
        circle.moveLeft();
        System.out.println("After moveLeft: " + circle);
    }
}
