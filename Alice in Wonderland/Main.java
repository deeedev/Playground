import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int firstDigit = n/10;
      int lastDigit = n%10;
      
      int sum = firstDigit + lastDigit;
      System.out.println("Alice must go in path-"+sum);
	}
}