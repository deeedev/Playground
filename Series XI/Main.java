import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      float num = 95;
      int count = 1;
      System.out.print(num+" ");
      for(double i=20.5;count<n;i=i+2){
         num+= i;
        System.out.print(num+" ");
        count++;
      }
	}
}