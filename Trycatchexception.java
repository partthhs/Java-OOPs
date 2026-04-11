import java.util.Scanner;
public class Trycatchexception{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter 1st number = ");
            String input1= sc.nextLine();

            System.out.print("Enter 2nd number = ");
            String input2= sc.nextLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            int result = num1/num2;

            System.out.println("Result = "+result);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR : Invalid input, please enter valid integers!");
        }
        catch(ArithmeticException e){
            System.out.println("ERROR:Cannot divide by ZERO ");
        }
        finally{
            System.out.println("Program excecuted SUCESSFULLY");
        }
        sc.close();
    }
}
