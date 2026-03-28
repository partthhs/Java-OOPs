
abstract class Student {
    String name;
    int rollNo;

    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

   
    abstract void displayRecord();

  
    void showBasicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Subclass
class Result extends Student {
    int marks;

    
    Result(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    
    void displayRecord() {
        showBasicDetails();
        System.out.println("Marks: " + marks);

        if (marks >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

public class Main {
    public static void main(String[] args) {
        Result s1 = new Result("Parth", 101, 85);
        s1.displayRecord();
    }
}