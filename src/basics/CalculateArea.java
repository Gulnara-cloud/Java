package basics;

public class CalculateArea {
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        double length = 3.50;
        double width = 0.50;
        double result = calculateArea(length, width);
        System.out.println("Calculate area: " + result);
    }
}