//Area of a rectangle code using single inheritance 

import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }
}

class Area extends Rectangle {
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.getData();
        obj.calculateArea();
    }
}