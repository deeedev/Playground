import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      
      int sum = 0;
      
      while(n>0)
      {
      	int temp = n%10;
        n = n/10;
        sum += temp;
      }  
      
      System.out.println(sum);
	}
}