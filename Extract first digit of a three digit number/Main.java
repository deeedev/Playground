import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      
      int firstDigit = n/100;
      System.out.println(firstDigit);
	}
}