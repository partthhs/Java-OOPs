import java.util.Scanner;
class Radius
{
    double r;
    void Calculate(double r)
    {
        this.r = r;
    }
}
class Area extends Radius{
    double a ;
    void Ppp(){
a = Math.PI*r*r;

    }
    void Display(){
        System.out.println("Area of the circle is = "+a);
    }
}
public class Circleinheritance {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
            System.out.print("Enter the value of radius = ");
double r = sc.nextInt();
obj.Calculate(r);
obj.Ppp();
obj.Display();
sc.close();
        
    }
    
}
