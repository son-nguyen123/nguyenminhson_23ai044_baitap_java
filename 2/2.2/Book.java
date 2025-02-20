public class Book {
    // Private instance variables
    private String name;
    private Author author;  // Using the Author class
    private double price;
    private int qty = 0;  // Default value if not provided

    // Constructor with 3 parameters
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor with 4 parameters
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Additional methods for Author's details
    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    // toString() method
    @Override
    public String toString() {
        return "Book[name=" + name + "," + author + ",price=" + price + ",qty=" + qty + "]";
    }
}
