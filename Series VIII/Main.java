import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      int num = 4;
      for(int i = 0; count<=n;i++){
         num = num + (i*i);
         System.out.print(num+" ");
         count++;
      }
	}
}