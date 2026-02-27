class Calculator {
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    
}
public class Methodoverloading {
    public static void main(String[]args)
    {
        Calculator c = new Calculator();

        System.out.println(c.add(4,6));
        System.out.println(c.add(2.4,1.3));

    }
}
    

