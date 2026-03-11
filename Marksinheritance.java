//code is about Calculation of Total Marks using MultilevelInheritance//
import java.util.Scanner;

import javax.crypto.ExemptionMechanism;
class Student
{
    int rollno;
    String name;
    void get(int r, String n)
    {
        rollno = r;
        name = n;
        System.out.println("-----------------------------------------");
        System.out.println("Roll number of the student is = "+rollno);
    System.out.println("Name of the student is = "+name);
    }
}
class Marks extends Student{
    int m1 ,m2,m3;
    void getmarks(int m1, int m2, int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
}
class Result extends Marks
{
void display()
{
    int re = m1+m2+m3;
    System.out.println("Total Marks = "+re);
        System.out.println("-----------------------------------------");
}
}

public class Marksinheritance {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        System.out.print("Enter Students Roll number = ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Students NAME = ");
    String name = sc.nextLine();

    System.out.print("Enter Students marks in 3 Subjects = ");
    int m1 = sc.nextInt();
     int m2 = sc.nextInt();
      int m3 = sc.nextInt();

    r.get(rollno,name);
    r.getmarks(m1,m2,m3);
    r.display();

    sc.close();
    }
    
}

