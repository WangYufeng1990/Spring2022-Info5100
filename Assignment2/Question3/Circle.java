package Assignment2.Question3;

public class Circle extends Shape{
    double radius;

    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return (Math.PI * this.radius * this.radius) / 2;
    }

    public double computePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void display() {
        System.out.println("I am a Circle.");
    }
}
