import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
           if(j%2==1)
             System.out.print("1 ");
           else
             System.out.print("0 ");
        }
        System.out.println();
      }
	}
}