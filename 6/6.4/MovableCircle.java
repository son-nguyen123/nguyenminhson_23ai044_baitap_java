// MovableCircle class implementing Moveable
public class MovableCircle implements Moveable {
    private MovablePoint center;  // Center of the circle
    private int radius;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Override moveUp() method
    @Override
    public void moveUp() {
        center.moveUp();
    }

    // Override moveDown() method
    @Override
    public void moveDown() {
        center.moveDown();
    }

    // Override moveLeft() method
    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    // Override moveRight() method
    @Override
    public void moveRight() {
        center.moveRight();
    }

    // toString() method
    @Override
    public String toString() {
        return "MovableCircle with radius " + radius + " and center " + center;
    }
}
