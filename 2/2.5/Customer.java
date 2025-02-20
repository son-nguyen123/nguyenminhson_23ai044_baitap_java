public class Customer {
    private int id;
    private String name;
    private char gender; // 'm' or 'f'

    // Constructor
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // toString() method
    @Override
    public String toString() {
        return "Customer[id=" + id + ",name=" + name + ",gender=" + gender + "]";
    }
}
