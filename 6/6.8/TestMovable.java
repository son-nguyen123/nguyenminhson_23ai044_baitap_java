public class TestMovable {
    public static void main(String[] args) {
        // Testing MovablePoint
        Movable m1 = new MovablePoint(5, 6, 10, 15); // Upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        // Testing MovableCircle
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // Upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        // Testing MovableRectangle
        Movable m3 = new MovableRectangle(0, 0, 10, 10, 5, 5);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
    }
}
