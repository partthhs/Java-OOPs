import java.util.Scanner;
public class Car {
    String brand;
    int year;
    double price;

    void display(){
        System.out.println("***************");
        System.out.println("Brand = " +brand);
        System.out.println("Year = " +year);
        System.out.println("Price = " +price);
        System.out.println("***************");
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Car c1=new Car();

        System.out.print("Enetr car brand = ");
        c1.brand = sc.nextLine();

        System.out.print("Enter year = ");
        c1.year = sc.nextInt();

        System.out.print("Enter car price = ");
        c1.price = sc.nextDouble();

        c1.display();
    }
}
