package Assignment2.Question2;

public class Triangle extends Shape{
    private double base;
    private double height;
    private double side;

    public Triangle(String name, String color, double area, double perimeter, double base, double height) {
        super(name, color, area, perimeter);
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, double area, double perimeter, double side) {
        super(name, color, area, perimeter);
        this.side = side;
    }

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * this.side;
    }
}

