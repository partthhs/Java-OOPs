import java.util.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class MonthNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the month number = ");
        int month = s.nextInt();

        try {
            if (month > 0 && month <= 12) {
                System.out.println("Month Number = " + month);
            } else {
                throw new MyException("Invalid Month Number");
            }
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        }

        s.close();
    }
}