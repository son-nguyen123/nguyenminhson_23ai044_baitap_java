public class Customer {
    private String name;
    private String membership;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.membership = "None"; // Default to no membership
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    // Getter and setter for membership
    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        if (membership.equalsIgnoreCase("Premium") || 
            membership.equalsIgnoreCase("Gold") || 
            membership.equalsIgnoreCase("Silver") || 
            membership.equalsIgnoreCase("None")) {
            this.membership = membership;
        } else {
            throw new IllegalArgumentException("Invalid membership type");
        }
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", membership=" + membership + "]";
    }
}
