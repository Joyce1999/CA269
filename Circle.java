public class Circle {
    
    double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        return(Math.PI * radius * radius);
    }
    public String toString()
    {
    return String.format("The area is %.3f",  area());
    }
}
