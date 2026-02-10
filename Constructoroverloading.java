public class Constructoroverloading {
    String brand;
    int price;

Constructoroverloading(){
        brand= "Not set";
        price= 0;
    }

    Constructoroverloading(String b, int p){
        brand = b;
        price = p;
    }

    void show(){
        System.out.println("Brand = "+brand);
        System.out.println("Price = " +price);
    }
    public static void main(String[]args){
         Constructoroverloading l1 = new Constructoroverloading();
        Constructoroverloading l2 = new Constructoroverloading("HP", 55000);

        l1.show();
        l2.show();
    }
}
