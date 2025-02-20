public class Account {
    private int id;
    private Customer customer;
    private double balance;

    // Constructor with default balance
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0; // Default balance
    }

    // Constructor with specified balance
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Additional methods
    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return this; // Return the current object for method chaining
    }

    public Account withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
        return this; // Return the current object for method chaining
    }

    // toString() method
    @Override
    public String toString() {
        return "Account[id=" + id + "," + customer.toString() + ",balance=" + balance + "]";
    }
}
