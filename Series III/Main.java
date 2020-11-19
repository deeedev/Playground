import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      int num = 1;
      
      while(count<=n){
        num = num * 3;
        System.out.print(num+" ");
        count++;
      }
      
	}
}