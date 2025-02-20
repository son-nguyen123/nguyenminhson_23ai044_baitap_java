public class TestAccount {
    public static void main(String[] args) {
        // Create a Customer instance
        Customer c1 = new Customer(101, "Alice", 'f');

        // Create Account instances
        Account a1 = new Account(1001, c1);
        Account a2 = new Account(1002, c1, 500.0);

        // Test toString()
        System.out.println(a1);
        System.out.println(a2);

        // Test deposit and withdraw methods
        a1.deposit(100).deposit(50);
        System.out.println("After deposit, " + a1);

        a2.withdraw(200);
        System.out.println("After withdrawal, " + a2);

        a2.withdraw(400); // Insufficient balance test
    }
}
