public class Area {
    public static double findArea(double radius) {
        return (3.14 * radius * radius);
    }

    public static int findArea(int length, int breadth) {
        return (length * breadth);
    }

    public static double findArea(double breadth, double height) {
        return (0.5 * breadth * height);
    }

    public static void main(String args[]) {
        System.out.println("Area of Circle: " + findArea(5.6));
        System.out.println("Area of Rectangle: " + findArea(5,6));
        System.out.println("Area of Triangle: " + findArea(5.5,6.2));
    }
}
