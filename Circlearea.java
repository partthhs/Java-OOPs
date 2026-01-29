import java.util.Scanner;
class Circlearea
{
int r;
double area;
void acceptRadius(int x)
{
r=x;
}
void calculateArea()
{
area = Math.PI*r*r;
}
void displayArea()
{
System.out.println("Area of Circle is = "+area);
}
public static void main(String[]args)
{
Circle c= new Circle();
Scanner sc= new Scanner(System.in);
System.out.println("Enter Radius = ");
int x = sc.nextInt();
c.acceptRadius(x);
c.calculateArea();
c.displayArea();
}
}