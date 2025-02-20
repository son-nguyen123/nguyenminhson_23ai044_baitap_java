// Square subclass
public class Square extends Rectangle {

    // Constructor
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and setter for side (overrides width and length)
    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    // Override toString
    @Override
    public String toString() {
        return "A Square with side=" + width + ", which is a subclass of " + super.toString();
    }
}
