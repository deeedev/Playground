import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n;
      
      for(int i =1;i<=2*n-1;i=i+2){
         int num =i;
         for(int j=1;j<=temp;j++){
            System.out.print(num+" ");
            num = num+2;
         }
         temp--;
         System.out.println();
      }
	}
}