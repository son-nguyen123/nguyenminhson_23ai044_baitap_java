public class TestBook {
    public static void main(String[] args) {
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Test Author's toString()

        // Construct a Book instance
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());

        // Test getAuthor()
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Using new methods to get author details
        System.out.println("Author's name (via Book): " + dummyBook.getAuthorName());
        System.out.println("Author's email (via Book): " + dummyBook.getAuthorEmail());
        System.out.println("Author's gender (via Book): " + dummyBook.getAuthorGender());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("More Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // Test toString()
    }
}
