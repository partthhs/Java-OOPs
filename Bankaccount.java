
import java.util.Scanner;
public class Bankaccount {
    String holdername;
    int accountnumber;
    double balance;
    void openAccount()
{
    Scanner ob= new Scanner(System.in);

    System.out.println("Enter account holder name= ");
    holdername=ob.nextLine();

    System.out.println("Enter account number= ");
    accountnumber=ob.nextInt();

    System.out.println("Enter initial balance = ");
    balance= ob.nextDouble();
}
void displayAccount()
{
    System.out.println("\nACCOUNT DETAILS");
    System.out.println("Holder Name="+holdername);
    System.out.println("Account Number ="+accountnumber);
    System.out.println("Balance = "+balance);
}
public static void main(String[]args)
{
    Bankaccount acc=new Bankaccount();
    acc.openAccount();
    acc.displayAccount();
}
    
}
