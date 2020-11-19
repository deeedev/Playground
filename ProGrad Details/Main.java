// import the respective packages
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
class ProGrad{
  String name;
  long id;
  String skills;
  
  public ProGrad(String name, long id, String skills){
 		this.name = name;
    	this.id = id;
    	this.skills = skills;
  }
}
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();
   long id = sc.nextLong();
   sc.nextLine();
   String skills = sc.nextLine();
    
   ProGrad obj = new ProGrad(name,id,skills);
    if(obj.name.matches("^[a-zA-Z ]*$") && obj.id>0){
	    System.out.println("ProGrad Details");
      	System.out.println("ProGrad Name: "+ obj.name);
      	System.out.println("Id: "+ obj.id);
	    System.out.println("Skill: "+ obj.skills);
    }
    else{
      	System.out.println("Invalid Input");
    }
  }
}