import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num =0;
      for(int i = 1;i<2*n;i=i+2){
        num = num+i;
        System.out.print(num+" ");
      }
	}
}