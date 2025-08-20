package week5.interfaces;

public class Rectangle extends Shape {
    private int height, width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        return 2 * (height + width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle!");
    }
}
