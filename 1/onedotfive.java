class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int id,  String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getid () {
        return id;
    }
    public String getfirstname () {
        return firstname;
    }
    public String getlastname () {
        return lastname;
    }
    public int getsalary () {
        return salary;
    }
    public void setsalary ( int salary) {
        this.salary = salary;    
    }
    public String getname () {
        return firstname + "" + lastname;
    }
    public int getannualsalary () {
        return salary * 12;
    }
    public int raisesalary (int persent) {
        salary+= salary + persent / 100;
        return salary;
    }
    public String tostring () {
        return "Employee[id = " + id + ",name = " + getname()+",salaryv="+ salary +"]";
    }
    }

public class onedotfive {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.print(e1);
        e1.setsalary(999);
        System.out.println(e1);
        System.out.println("id is:" + e1.getid());
        System.out.println("firstname is:" + e1.getfirstname());
        System.out.println("lastname is:" + e1.getlastname());
        System.out.println("salary is:" + e1.getsalary());
        System.out.println("name is:" + e1.getname());
        System.out.println(" annual salary is:" + e1.getannualsalary());
        System.out.println(e1.raisesalary(10));
        System.out.println(e1);
    }
}
