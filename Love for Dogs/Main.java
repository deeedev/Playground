import java.util.Scanner;
import java.util.regex.*;
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
class Dog{
  Scanner sc = new Scanner(System.in);
  String name = sc.nextLine();
  double weight = sc.nextDouble();
  int age = sc.nextInt();
  String color = sc.next();
  String breed = sc.next();
}

//Main class to control all other classes
public class Main{
  public static void main(String[] args){
	Dog obj = new Dog();
    if(obj.name.matches("^[a-zA-Z ]*$") && obj.weight >0 && obj.age> 0){
    	System.out.println("Name of the dog: "+obj.name);
      	System.out.println("Weight of the dog: "+obj.weight);
      	System.out.println("Age of the dog: "+obj.age);
      	System.out.println("Color of the dog: "+obj.color);
      	System.out.println("Breed of the dog: "+obj.breed);
    }
    else{
    	System.out.print("Invalid Input");
    }
  
  }
}