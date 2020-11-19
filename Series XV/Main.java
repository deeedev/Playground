import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 2;
      int a = 3, b=8, c;
      System.out.print(a+" "+b+" ");
      for(int i =2;count<n;i++){
         c = a+b+i;
         a = b;
         b = c;
         System.out.print(c+" ");
        count++;
      }
	}
}