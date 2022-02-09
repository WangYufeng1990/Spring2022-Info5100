public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {

    }

    public double volume(Box box) {
        return box.width * box.height * box.depth;
    }
}
