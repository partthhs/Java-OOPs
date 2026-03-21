class Shape {
    double area(double a, double b) {
        return 0;
    }
}

class Rectangle extends Shape {
    double area(double length, double width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        System.out.println("Area of Rectangle: " + s.area(10, 5));
    }
}