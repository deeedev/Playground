import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int profit = x*a - b*x -100;
      
      System.out.println("The profit obtained is Rs."+profit);
	}
}