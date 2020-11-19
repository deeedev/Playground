import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      int num = 5;
      System.out.print(num+" ");
      for(int i=1;count<n;i++){
         if(i%2==1){
           
         	num = num+(i*11);
         	System.out.print(num+" ");
         	count++;
         }
         }
      
	}
}