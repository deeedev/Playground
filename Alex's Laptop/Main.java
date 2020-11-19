import java.util.Scanner;
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

class Laptop{
    	Scanner sc = new Scanner(System.in);
      	String brandName = sc.nextLine();
      	String processorName = sc.nextLine();
      	String os = sc.next();
      	long processorRange= sc.nextLong();
      	long ram = sc.nextLong();
  
  	public void displayLaptopDetails(){
		System.out.println("Laptop Details");
      	System.out.println("Laptop Brand: "+brandName);
      	System.out.println("Processor Name: "+processorName);
      	System.out.println("OS: "+os);
      	System.out.println("Processor Range: "+processorRange+" bit");
      	System.out.println("Ram: "+ram+" GB");
    }
}

//Main class to control all other classes
public class Main{
  public static void main(String[] args){
 	Laptop laptop = new Laptop();
    if(laptop.ram > 0 && laptop.processorRange > 0){
    	laptop.displayLaptopDetails();
    }
    else{
    	System.out.println("Invalid Input");
    }
  }
}