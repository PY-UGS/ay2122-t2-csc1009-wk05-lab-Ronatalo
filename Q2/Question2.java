public class Question2 {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(9,5);
        Triangle tri = new Triangle(10,8);
        Circle circle = new Circle(5,5);
        Ellipse elli = new Ellipse(7,7);
        Square sq = new Square(6,6);
        Shape shape;

        shape = rect;
        System.out.println("Inside Area of Rectangle");
        System.out.println("Area is "+shape.area());

        shape = tri;
        System.out.println("Inside Area of Triangle");
        System.out.println("Area is "+shape.area());

        shape = circle;
        System.out.println("Inside Area of Circle");
        System.out.println("Area is "+shape.area());

        shape = elli;
        System.out.println("Inside Area of Ellipse");
        System.out.println("Area is "+shape.area());

        shape = sq;
        System.out.println("Inside Area of Square");
        System.out.println("Area is "+shape.area());
    }
}
