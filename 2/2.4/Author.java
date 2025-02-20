public class Author {
    private String name;
    private String email;

    // Constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setter method
    public void setEmail(String email) {
        this.email = email;
    }

    // toString() method
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
