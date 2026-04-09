//this code contains simple interest program using final keyword
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        final double RATE = 5.0;

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

       
        double si = (p * RATE * t) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}