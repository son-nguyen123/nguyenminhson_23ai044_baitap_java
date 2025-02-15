public class onedoteight {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // Expected: 01:02:03

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // Expected: 04:05:06
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // Expected: 23:59:58

        // Test nextSecond()
        System.out.println(t1.nextSecond());  // Expected: 23:59:59
        System.out.println(t1.nextSecond().nextSecond());  // Expected: 00:00:01

        // Test previousSecond()
        System.out.println(t1.previousSecond());  // Expected: 00:00:00
        System.out.println(t1.previousSecond().previousSecond());  // Expected: 23:59:58
    }
}

// Time class inside the same file
class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setters
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second");
        }
    }

    // Set time method
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Increase time by one second
    public Time nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            } else {
                minute++;
            }
        } else {
            second++;
        }
        return this; // Return the same object for chaining
    }

    // Decrease time by one second
    public Time previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour--;
                }
            } else {
                minute--;
            }
        } else {
            second--;
        }
        return this; // Return the same object for chaining
    }

    // Convert time to string format HH:MM:SS
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
