public class TestMyTime {
    public static void main(String[] args) {
        // Create a MyTime instance
        MyTime time = new MyTime(23, 59, 58);
        System.out.println("Initial time: " + time);

        // Test nextSecond()
        time.nextSecond();
        System.out.println("After next second: " + time);
        time.nextSecond();
        System.out.println("After next second: " + time); // Should roll over to 00:00:00

        // Test nextMinute()
        time.nextMinute();
        System.out.println("After next minute: " + time);

        // Test nextHour()
        time.nextHour();
        System.out.println("After next hour: " + time);

        // Test previousSecond()
        time.previousSecond();
        System.out.println("After previous second: " + time);

        // Test previousMinute()
        time.previousMinute();
        System.out.println("After previous minute: " + time);

        // Test previousHour()
        time.previousHour();
        System.out.println("After previous hour: " + time);

        // Test invalid input handling
        try {
            MyTime invalidTime = new MyTime(25, 0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
    }
}
