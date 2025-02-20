public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Volume: " + c1.getVolume());

        Cylinder c2 = new Cylinder(3);
        System.out.println(c2);
        System.out.println("Volume: " + c2.getVolume());

        Cylinder c3 = new Cylinder(3, 5);
        System.out.println(c3);
        System.out.println("Volume: " + c3.getVolume());

        Cylinder c4 = new Cylinder(3, 5, "blue");
        System.out.println(c4);
        System.out.println("Volume: " + c4.getVolume());

        // Modifying properties
        c4.setHeight(7);
        c4.setRadius(4);
        System.out.println("After modifying:");
        System.out.println(c4);
        System.out.println("Volume: " + c4.getVolume());
    }
}
