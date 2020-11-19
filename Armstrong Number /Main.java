import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int temp = n;
      int temp1= n;
      int count = 0;
      int sum = 0;
      while(temp>0){
        temp = temp/10;
        count++;
      }
      
      while(temp1>0){
        int temp2 = temp1%10;
        sum += Math.pow(temp2,count);
        temp1 = temp1/10;
      }
      
      if(sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}