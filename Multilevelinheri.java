class Vehicle {
    Vehicle(){
        System.out.println("This is a vehicle");
    }
}
class Fourwheeler extends Vehicle{
Fourwheeler(){
    System.out.println("This vehicle is Fourwheeler");
}
}
class Car extends Fourwheeler{
    Car(){
        System.out.println("This Fourwheeler vehivle is CAR");
    }
}
public class Multilevelinheri {
        public static void main(String[]args)
    {
        Car obj = new Car();
    }
}
