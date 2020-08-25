public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;

    }
    public String toString()
    {
    return String.format("The area is %.3f",  area());
    }
}
