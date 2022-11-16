public class Circle extends Point{
    private double x;
    private double y;
    private double rightParam;

    public Circle()
    {
        super();
        rightParam=0;
    }

    public Circle(double x,double y,double rightParam)
    {
        this.x=x;
        this.y=y;
        this.rightParam=rightParam;
    }

    public double getRightParam() {
        return rightParam;
    }

    public void print()
    {
        super.print();
        System.out.println("Right parameter:"+rightParam);
    }

    public void perimeter()
    {
        System.out.println(Math.PI*2*rightParam);
    }

    public void square()
    {
        System.out.println(Math.PI*rightParam*rightParam);
    }
}
