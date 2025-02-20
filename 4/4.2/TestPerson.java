public class TestPerson {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", "123 Main St");
        System.out.println(person);

        // Create a Student object
        Student student = new Student("Bob", "456 University Rd", "Computer Science", 2023, 15000);
        System.out.println(student);

        // Create a Staff object
        Staff staff = new Staff("Charlie", "789 College Ave", "XYZ High School", 50000);
        System.out.println(staff);
    }
}
