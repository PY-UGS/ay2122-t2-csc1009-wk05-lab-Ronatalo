public abstract class Shape {
    private double var1;
    private double var2;
    private final static double PI = 3.14;
    public Shape(){

    }
    public Shape(double var1, double var2)
    {
        this.var1 = var1;
        this.var2 = var2;
    }

    public double getVar1() {
        return var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }

    public double getPI() {
        return PI;
    }

    abstract double area();



}
