package Assignment2.Question2;

public class Solution {
    public static void main(String[] args) {
        Shape s = new Shape("square", "blue", 8.0, 4.0);
        s.printShape();
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        Triangle t = new Triangle("Triangle", "red", 4.0, 5.0);
        Triangle t1 = new Triangle("Triangle1", "red", 3.0);
        t.printShape();
        System.out.println(t.getArea());
        System.out.println(t1.getPerimeter());

        Rhombus r = new Rhombus("Rhombus", "green", 5.0, 6.0);
        r.printShape();
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}