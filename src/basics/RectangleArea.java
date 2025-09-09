package basics;

public class RectangleArea {
    public static int calculateArea(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        int result = calculateArea(length, width);
        System.out.println("Area of rectangle: " + result);
    }
}
/* Define the method
public → accessible from anywhere
static → allows calling without creating an object
int → return type (area will be an integer)
calculateArea → method name
Parameters: int length, int width
 */