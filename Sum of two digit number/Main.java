import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int n_firstDigit = n/10;
      int n_lastDigit = n%10;
      
      int sum = n_firstDigit + n_lastDigit;
      System.out.println(sum);
	}
}