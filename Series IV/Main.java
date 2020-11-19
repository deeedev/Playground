import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      double num = 0.5;
      System.out.print(num+" ");
      for(int i=1;count<n;i=i*3){
        num += i;
        System.out.print(num+" ");
        count++;
      }
      
	}
}