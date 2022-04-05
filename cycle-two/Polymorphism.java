abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Four Sides");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Three Sides");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Six Sides");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.numberOfSides();
        Triangle triangle = new Triangle();
        triangle.numberOfSides();
        Hexagon hexagon = new Hexagon();
        hexagon.numberOfSides();
    }
}
