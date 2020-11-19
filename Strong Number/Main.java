import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n;
      int sum = 0;
      
      while(temp>0){
        int temp1 = temp%10;
        int factorial=1;
        for(int i=1;i<=temp1;i++){
          factorial = factorial*i;
        }
       
        sum += factorial;
        temp = temp/10;
      }
      
      if(sum == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}