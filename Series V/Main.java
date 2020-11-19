import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      int num = 121;
      System.out.print(num+" ");
      for(int i=104; count<n;i=i+32){
         num += i;
        System.out.print(num+" ");
        count++;
      }
	}
}