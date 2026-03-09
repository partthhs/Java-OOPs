import java.util.Scanner;
class Add
{
    void Calculate(int n1,int n2)
    {
        System.out.println("Addition of the two numbers is + "+(n1+n2));
    }
}
class Product extends Add{
    
    void Pro(int a , int b)
    {
        System.out.println("Product is = "+(a*b));
    }
}
public class Singleinheri
 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Product obj = new Product();
    System.out.print("Enter two numbers for addition ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    System.out.print("Enter two numbers for multiplication = ");
    int a = sc.nextInt();
    int b = sc.nextInt();
obj.Calculate(n1,n2);
obj.Pro(a,b);
    sc.close();
}}
