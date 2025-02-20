import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    // Constructor with varargs
    public MyPolynomial(double... coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    // Get the degree of the polynomial
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Evaluate the polynomial for a given x
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Add another polynomial to this one and return a new polynomial
    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            newCoeffs[i] += this.coeffs[i];
        }
        for (int i = 0; i <= another.getDegree(); i++) {
            newCoeffs[i] += another.coeffs[i];
        }

        return new MyPolynomial(newCoeffs);
    }

    // Multiply this polynomial with another and return a new polynomial
    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }

    // Convert the polynomial to a string representation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(coeffs[i] > 0 ? " + " : " - ");
                } else if (coeffs[i] < 0) {
                    sb.append("-");
                }

                sb.append(Math.abs(coeffs[i]));
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }
}
