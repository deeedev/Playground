import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     
      for(int i=1;i<=n;i++){
        int num =i;
         for(int j=1;j<=n;j++){
			if(i%2==1 && j==n){
               num++;
               System.out.print(num);
            }
            else if(i%2==0 && j==1){
               num++;
               System.out.print(num);
            }
            else
              System.out.print(i);
              
         }
        System.out.println();
      }
	}
}