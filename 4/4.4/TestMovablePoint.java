public class TestMovablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println("Point: " + p1);
        
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("MovablePoint before move: " + mp1);
        mp1.move();
        System.out.println("MovablePoint after move: " + mp1);
        
        mp1.setSpeed(2.5f, 3.0f);
        System.out.println("MovablePoint speed updated: " + mp1);
        mp1.move();
        System.out.println("MovablePoint after another move: " + mp1);
    }
}
