abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}