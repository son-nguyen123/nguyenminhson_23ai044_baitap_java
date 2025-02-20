public class MyPoint {
    private int x;
    private int y;

    // No-arg constructor (default to (0, 0))
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get x and y as an array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Distance from this point to another (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance from this point to another MyPoint
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Distance from this point to the origin (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
