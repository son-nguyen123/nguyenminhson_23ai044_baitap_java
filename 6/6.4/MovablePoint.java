// MovablePoint class implementing Moveable
public class MovablePoint implements Moveable {
    private int x, y;      // Coordinates of the point
    private int xSpeed, ySpeed;  // Speed of movement

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Override moveUp() method
    @Override
    public void moveUp() {
        y += ySpeed;
    }

    // Override moveDown() method
    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    // Override moveLeft() method
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    // Override moveRight() method
    @Override
    public void moveRight() {
        x += xSpeed;
    }

    // toString() method
    @Override
    public String toString() {
        return "MovablePoint at (" + x + ", " + y + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}
