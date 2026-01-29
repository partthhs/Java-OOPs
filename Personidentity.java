public class Personidentity
{
String name;
String country;
int age;
String occupation;

void showDetails(){
System.out.println("Name= "+name);
System.out.println("Country= "+country);
System.out.println("Age= "+age);
System.out.println("Occupation= "+occupation);
}
public static void main(String[]args){

Personidentity person= new Personidentity();
person.name="Sky";
person.country="India";
person.age= 30;
person.occupation= "Boxer";

person.showDetails();
}
}