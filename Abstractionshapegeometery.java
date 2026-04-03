import java.util.Scanner;


abstract class Shape {
    abstract void area();
    abstract void perimeter();
}


class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}


class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Shape c = new Circle(r);
        c.area();
        c.perimeter();

        
        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        Shape rect = new Rectangle(l, w);
        rect.area();
        rect.perimeter();

        sc.close();
    }
}