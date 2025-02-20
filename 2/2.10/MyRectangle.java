public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor using coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor using MyPoint instances
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Compute width
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Compute height
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Compute area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Compute perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
