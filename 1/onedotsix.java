// Account class
class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor with balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor without balance (defaults to 0)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Getter for ID
    public String getID() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Balance
    public int getBalance() {
        return balance;
    }

    // Credit method (adds amount to balance)
    public void credit(int amount) {
        balance += amount;
    }

    // Debit method (subtracts amount if sufficient balance)
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Transfer method (transfers amount to another account)
    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

// TestMain class
public class onedotsix {
    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
