public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;  // Package access

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed; // Moving up (y decreases)
    }

    @Override
    public void moveDown() {
        y += ySpeed; // Moving down (y increases)
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // Moving left (x decreases)
    }

    @Override
    public void moveRight() {
        x += xSpeed; // Moving right (x increases)
    }

    @Override
    public String toString() {
        return "MovablePoint(x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ")";
    }
}
