package week5.interfaces;

public class Paint {

    static void drawEverything(Drawable[] stuffToDraw) {
        for (Drawable drawable : stuffToDraw) {
            drawable.draw();
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(1, 2);

        drawEverything(new Drawable[]{
                cat,
                circle,
                rectangle
        });
    }
}
