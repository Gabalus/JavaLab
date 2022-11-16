public class Ellipse extends Circle{
    private double x;
    private double y;
    private double rightParam;
    private double xParam;
    private double yParam;
    public Ellipse()
    {
        super();
        xParam=1;
        yParam=1;
    }
    public Ellipse(double x,double y, double xParam,double yParam)
    {
        super(x,y,1);
        this.xParam=xParam;
        this.yParam=yParam;
    }

    public double getxParam() {
        return xParam;
    }

    public double getyParam() {
        return yParam;
    }

    public void print() {
        super.print();
        System.out.println("xParameter = "+xParam+" yParameter = "+yParam);
    }

    public void perimeter()
    {
        System.out.println(4*(Math.PI*xParam*yParam+(xParam-yParam))/(xParam+yParam));
    }

    public void square()
    {
        System.out.println(Math.PI*xParam*yParam);
    }
}
