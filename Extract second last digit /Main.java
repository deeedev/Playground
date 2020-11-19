import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int count = 1;
      int n = sc.nextInt();
      int temp = 0;
      while(count<3){
      	temp = n%10;
        n = n/10;
        count++;
      }
      System.out.print(temp);
	}
}