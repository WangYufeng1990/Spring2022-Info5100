package Assignment2.Question3;

public class Rectangle extends Shape{
    double length, width;
    Rectangle() {

    }
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void computeArea() {
        System.out.println(this.length * this.width + "");
    }

    void computePerimeter() {
        System.out.println(2 * (this.length + this.width) + "");
    }

    @Override
    public void display() {
        System.out.println("I am a Rectangle.");
    }
}
