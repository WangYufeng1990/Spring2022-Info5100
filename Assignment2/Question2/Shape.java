package Assignment2.Question2;

public class Shape {
    public String name;
    public String color;
    public double area;
    public double perimeter;

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printShape() {
        System.out.println("My shape is " + this.name);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }
}
