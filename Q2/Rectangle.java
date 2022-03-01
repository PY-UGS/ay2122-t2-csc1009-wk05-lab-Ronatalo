public class Rectangle extends Shape{
    public Rectangle()
    {

    }

    public Rectangle(double var1, double var2)
    {
        super.setVar1(var1);
        super.setVar2(var2);
    }

    public double area()
    {
        return super.getVar1()*super.getVar2();
    }

}
