import java.util.Scanner;

class Area {

   
    double area(double r) {
        return Math.PI * r * r;
    }

   
    double area(double l, double b) {
        return l * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Enter choice (1 for Circle, 2 for Rectangle): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            System.out.println("Area of Circle = " + obj.area(r));
        } 
        else if (choice == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();
            System.out.println("Area of Rectangle = " + obj.area(l, b));
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}