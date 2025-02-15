// Employee class
class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for First Name
    public String getFirstName() {
        return firstName;
    }

    // Getter for Last Name
    public String getLastName() {
        return lastName;
    }

    // Getter for Salary
    public int getSalary() {
        return salary;
    }

    // Setter for Salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Get Full Name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Get Annual Salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise Salary by Percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}

// TestMain class
public class onedotfourô {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
