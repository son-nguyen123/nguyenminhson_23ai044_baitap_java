public class TestCustomer {
    public static void main(String[] args) {
        // Create a Customer instance
        Customer c1 = new Customer(101, "Alice", 'f');
        System.out.println(c1);  // Test toString()

        // Test getters
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());
    }
}
