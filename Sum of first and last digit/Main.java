import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int divisor = 10;
      int last_digit = n%10;
      int temp = n;
      while(temp>0)
      {	
        temp = temp/100;
        divisor = divisor * 10;
        
      }  
      int first_digit = n/divisor; 
      int sum = first_digit+last_digit;
      
      System.out.println(sum);
	}
}