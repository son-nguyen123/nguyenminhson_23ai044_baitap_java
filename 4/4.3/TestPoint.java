public class TestPoint {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D: " + p2d);
        System.out.println("X: " + p2d.getX() + ", Y: " + p2d.getY());

        Point3D p3d = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println("Point3D: " + p3d);
        System.out.println("X: " + p3d.getX() + ", Y: " + p3d.getY() + ", Z: " + p3d.getZ());

        p3d.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("Updated Point3D: " + p3d);

        float[] xyz = p3d.getXYZ();
        System.out.println("XYZ Array: (" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + ")");
    }
}
