public class Book {
    private String isbn;
    private String name;
    private Author author;  // Composition: A Book has one Author
    private double price;
    private int qty;

    // Constructor
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter methods
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setter methods
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Additional methods for convenience
    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    // toString() method
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + "," + author.toString() +
                ",price=" + price + ",qty=" + qty + "]";
    }
}
