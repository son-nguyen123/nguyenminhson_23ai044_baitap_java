import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = 
        {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = 
        {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAY_IN_MONTHS = 
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Constructor
    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    // Set date with validation
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    // Static method to check if it's a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Static method to check if a given date is valid
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDays = DAY_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        return day >= 1 && day <= maxDays;
    }

    // Get the day of the week (0 = Sunday, ..., 6 = Saturday)
    public static int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1; // Adjust to match 0-based index
    }

    // Getters
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    // Setters with validation
    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public void setDay(int day) {
        int maxDays = DAY_IN_MONTHS[this.month - 1];
        if (this.month == 2 && isLeapYear(this.year)) {
            maxDays = 29;
        }
        if (day >= 1 && day <= maxDays) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    // Convert date to string format "DayOfWeek Day Month Year"
    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }

    // Move to the next day
    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else {
            day = 1;
            nextMonth();
        }
        return this;
    }

    // Move to the next month
    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            nextYear();
        } else {
            month++;
        }
        int maxDays = DAY_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        if (day > maxDays) {
            day = maxDays;
        }
        return this;
    }

    // Move to the next year
    public MyDate nextYear() {
        if (year < 9999) {
            year++;
            if (month == 2 && day == 29 && !isLeapYear(year)) {
                day = 28;
            }
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    // Move to the previous day
    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            previousMonth();
            day = DAY_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }

    // Move to the previous month
    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            previousYear();
        } else {
            month--;
        }
        int maxDays = DAY_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        if (day > maxDays) {
            day = maxDays;
        }
        return this;
    }

    // Move to the previous year
    public MyDate previousYear() {
        if (year > 1) {
            year--;
            if (month == 2 && day == 29 && !isLeapYear(year)) {
                day = 28;
            }
        }
        return this;
    }
}
