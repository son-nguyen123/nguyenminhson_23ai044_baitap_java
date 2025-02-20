public class TestMyLine {
    public static void main(String[] args) {
        // Creating a MyLine object using (x1, y1) and (x2, y2)
        MyLine line1 = new MyLine(1, 2, 5, 6);
        System.out.println(line1);

        // Creating a MyLine object using MyPoint instances
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);

        // Testing getters
        System.out.println("Begin Point: " + line2.getBegin());
        System.out.println("End Point: " + line2.getEnd());
        System.out.println("Begin X: " + line2.getBeginX());
        System.out.println("Begin Y: " + line2.getBeginY());
        System.out.println("End X: " + line2.getEndX());
        System.out.println("End Y: " + line2.getEndY());

        // Testing setters
        line2.setBegin(new MyPoint(0, 0));
        line2.setEnd(new MyPoint(10, 10));
        System.out.println("After updating points: " + line2);

        line2.setBeginXY(2, 2);
        line2.setEndXY(8, 8);
        System.out.println("After setting XY: " + line2);

        // Testing length and gradient
        System.out.println("Line Length: " + line2.getLength());
        System.out.println("Line Gradient: " + line2.getGradient());
    }
}
