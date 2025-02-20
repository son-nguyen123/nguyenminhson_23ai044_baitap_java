public class onedotnine {
    public static void main(String[] args) {
        // Test constructor and toString()
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball);  // Expected: Ball[(1.1,2.2),speed=(3.3,4.4)]

        // Test Setters and Getters
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball);  // Expected: Ball[(80.0,35.0),speed=(4.0,6.0)]
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());

        // Bounce the ball within the boundary
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }
}

// Ball class inside the same file
class Ball {
    private float x, y;
    private int radius;
    private float xDelta, yDelta;

    // Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getters
    public float getX() { return x; }
    public float getY() { return y; }
    public int getRadius() { return radius; }
    public float getXDelta() { return xDelta; }
    public float getYDelta() { return yDelta; }

    // Setters
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }

    // Move the ball
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Reflect horizontal direction
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Reflect vertical direction
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // Convert ball to string format
    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xDelta, yDelta);
    }
}
