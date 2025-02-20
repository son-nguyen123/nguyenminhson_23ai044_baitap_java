public class TestBook {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // Test toString()

        // Test getters and setters
        javaDummy.setPrice(29.99);
        javaDummy.setQty(88);
        System.out.println("Book Name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());

        // Test getting author details
        System.out.println("Authors: " + javaDummy.getAuthorNames());

        // Retrieve authors individually
        Author[] bookAuthors = javaDummy.getAuthors();
        for (Author author : bookAuthors) {
            System.out.println("Author: " + author.getName() + " - Email: " + author.getEmail());
        }
    }
}
