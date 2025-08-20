package week5.interfaces;

public class Circle extends Shape implements Drawable, Printable {

    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    double area() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void print() {

    }
}
