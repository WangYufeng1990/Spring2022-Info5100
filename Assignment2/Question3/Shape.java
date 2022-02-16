package Assignment2.Question3;

public class Shape {
    String name;
    double area, perimeter;

    public Shape(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
    }

    public void display() {
        System.out.println("My shape is " + this.name);
    }
}
