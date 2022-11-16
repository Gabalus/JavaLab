public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void print()
    {
        System.out.println(real+"+"imaginary+"i");
    }

    public void sum(Complex complex)
    {
        real=real+complex.real;
        imaginary=imaginary+complex.imaginary;
    }

    public void subtraction(Complex complex)
    {
        real = real - complex.real;
        imaginary = imaginary - complex.imaginary;
    }

    public void multiplication(Complex complex)
    {
        real=real* complex.real-imaginary*complex.imaginary;
        imaginary= complex.real*imaginary+real*complex.imaginary;
    }
}
