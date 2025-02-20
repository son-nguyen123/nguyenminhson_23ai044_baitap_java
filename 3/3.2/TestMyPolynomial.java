public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3); // 3.3x^2 + 2.2x + 1.1
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4); // 4.4x^3 + 3.3x^2 + 2.2x + 1.1

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Degree of Polynomial 1: " + p1.getDegree());
        System.out.println("Evaluation of Polynomial 1 at x=2: " + p1.evaluate(2));

        System.out.println("\nPolynomial 2: " + p2);
        System.out.println("Degree of Polynomial 2: " + p2.getDegree());
        System.out.println("Evaluation of Polynomial 2 at x=2: " + p2.evaluate(2));

        System.out.println("\nAddition of P1 and P2: " + p1.add(p2));
        System.out.println("Multiplication of P1 and P2: " + p1.multiply(p2));
    }
}
