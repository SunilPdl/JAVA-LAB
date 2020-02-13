//using abstract methods and classes.
abstract class Object
{
    double dim1;
    double dim2;

    Object(double a , double b)
    {
        dim1 = a;
        dim2 = b;
    }

    //area is now an abstract method.
    abstract double area();
}

class Rectangle extends Object
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }

    //overide area for rectangle.
    double area()
    {
        System.out.println("Inside area for rectangle.");
        return dim1*dim2;
    }
}

class Triangle extends Object
{
    Triangle(double a, double b)
    {
        super(a,b);
    }

    //Overide area for Triangle.
    double area()
    {
        System.out.println("Inside area for triangle.");
        return dim1*dim2/2;
    }
}

class Abstract
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(10,30);
        Triangle t = new Triangle(12,7);
        Object obj;
        obj = r;
        System.out.println("Area of Rectangle is:" +obj.area());

        obj = t;
        System.out.println("Area of Triangle is:" +obj.area());
    }
}
