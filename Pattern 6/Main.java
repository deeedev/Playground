import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=1;i<=n;i++){
        int num =1; 
        for( int j=1;j<=i+(i-1);j++){
            System.out.print(num+" ");
            num++;
         }
        System.out.println();
      }
	}
}