class Animal
{
    Animal()
    {
        System.out.println("This ia an animal");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("This animal is dog");
    }
}
class Cat extends Animal{
Cat(){
System.out.println("This animal is cat");
}
}
public class Heirinheritance {
    public static void main(String[]args)
    {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
    }
    
}
