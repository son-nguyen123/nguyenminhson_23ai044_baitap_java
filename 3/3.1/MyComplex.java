class MyComplex {
    private double real;
    private double imag;

    // Constructors
    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters and Setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    // Check if the complex number is real (imaginary part is 0)
    public boolean isReal() {
        return imag == 0;
    }

    // Check if the complex number is purely imaginary (real part is 0)
    public boolean isImaginary() {
        return real == 0;
    }

    // Check equality with given real and imaginary parts
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    // Check equality with another MyComplex instance
    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    // Calculate the magnitude of the complex number
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Add another complex number to this instance (modifies this instance)
    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    // Add another complex number and return a new MyComplex instance
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}
