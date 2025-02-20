import java.util.*;

public class PolyLine {
    private List<Point> points; // List of Point instances

    // Default constructor
    public PolyLine() {
        points = new ArrayList<Point>();  // Implemented with ArrayList
    }

    // Constructor with a list of points
    public PolyLine(List<Point> points) {
        this.points = points;
    }

    // Append a point using x and y values
    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    // Append a point using a Point object
    public void appendPoint(Point point) {
        points.add(point);
    }

    // Return the total length of the polyline
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distance(points.get(i + 1));
        }
        return length;
    }

    // toString method: Return the list of points as a string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point point : points) {
            sb.append(point.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
