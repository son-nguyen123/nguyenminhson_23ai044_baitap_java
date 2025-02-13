public class Employee {
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

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to raise salary
    public int raiseSalary(int percent) {
        this.salary += (this.salary * percent) / 100;
        return this.salary;
    }

    // toString() method
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}
public class Java {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // Calls toString()

        e1.setSalary(999);
        System.out.println(e1);  // Calls toString()
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        System.out.println("New salary after 10% raise: " + e1.raiseSalary(10));
        System.out.println(e1);
    }
}
