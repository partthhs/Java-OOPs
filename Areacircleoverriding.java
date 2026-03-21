class Shape {
    double area(double r) {
        return 0;  
    }
}

class Circle extends Shape {
    double area(double r) {
        return 3.14 * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();  

        double result = s.area(5);   
        System.out.println("Area of Circle: " + result);
    }
}