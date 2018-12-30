public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5, 4));
        System.out.println(area(-1, 4));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double PI = 3.14159;
        double calcRadius = (radius * radius) * PI;
        return calcRadius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0 || (x < 0 && y < 0)) {
            return -1;
        }
        double calcRectangle = x * y;
        return calcRectangle;
    }
}
