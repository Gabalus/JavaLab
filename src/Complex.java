public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real,double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }
    public void add(double real,double imaginary)
    {
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void substraction(double real,double imaginary)
    {
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void multiplication(double real,double imaginary)
    {
        this.real=this.real*real-this.imaginary*imaginary;
        this.imaginary=real*this.imaginary+this.real*imaginary;
    }
}
