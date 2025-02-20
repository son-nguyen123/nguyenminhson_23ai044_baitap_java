public class TestMyTriangle {
    public static void main(String[] args) {
        // Create triangle using coordinates
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.print("Type: ");
        t1.printType();

        // Create triangle using MyPoint instances
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 1);
        MyPoint p3 = new MyPoint(2, 5);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.print("Type: ");
        t2.printType();
    }
}
