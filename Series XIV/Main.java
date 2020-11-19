import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      int num =2;
      System.out.print(num+" ");
      for(int i=3;count<n;i=i*2){
        num += i;
        System.out.print(num+" ");
        count++;
      }
      
	}
}