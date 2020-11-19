import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int expo = sc.nextInt();
      
      int result = Power(base,expo);
      System.out.print(result);
      
	}
  
    public static int Power(int a,int b){
      int pow =  1;
      
      while(b>0){
         pow = pow*a;
         b--;
      }
      return pow;
      
    }
}