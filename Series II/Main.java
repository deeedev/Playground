import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 6;
      int count = 1;
      for(int i=0; count<=n; i=i+5){
        sum += i;
        System.out.print(sum+" ");
        count++;
      }
	}
}