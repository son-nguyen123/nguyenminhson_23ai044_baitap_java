public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex num1 = new MyComplex(1.1, 2.2);
        MyComplex num2 = new MyComplex(3.3, 4.4);

        System.out.println("Number 1: " + num1);
        System.out.println("Is real? " + num1.isReal());
        System.out.println("Is imaginary? " + num1.isImaginary());

        System.out.println("\nNumber 2: " + num2);
        System.out.println("Is real? " + num2.isReal());
        System.out.println("Is imaginary? " + num2.isImaginary());

        System.out.println("\nChecking equality:");
        System.out.println(num1 + " equals " + num2 + "? " + num1.equals(num2));

        System.out.println("\nAddition using addInto():");
        num1.addInto(num2);
        System.out.println("Result: " + num1);

        System.out.println("\nAddition using addNew():");
        MyComplex num3 = new MyComplex(1.1, 2.2);
        MyComplex result = num3.addNew(num2);
        System.out.println(num3 + " + " + num2 + " = " + result);
    }
}
