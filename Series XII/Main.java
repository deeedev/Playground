import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 2;
      int a=9,b=11,c;
      System.out.print(a+" "+b+" ");
      
      for(int i=0;count<n;i++){
         c = a+b;
         a = b;
         b = c;
        System.out.print(c+" ");
        count++;
      }
      
	}
}