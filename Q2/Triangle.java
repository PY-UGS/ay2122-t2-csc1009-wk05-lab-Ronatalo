public class Triangle extends Shape {
    public Triangle(double var1, double var2)
    {
        super.setVar1(var1);
        super.setVar2(var2);
    }

    public double area()
    {
        return super.getVar1()*super.getVar2()*0.5;
    }
}
