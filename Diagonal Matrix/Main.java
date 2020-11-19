import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [][] arr = new int[n][n];
      
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             arr[i][j] = sc.nextInt();
         }
      }
      
      boolean IsDiagonal = false;
      
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(i!=j){
                if(arr[i][j] == 0)
                  IsDiagonal = true;
             }
         }
      }
      
      if(IsDiagonal)
        System.out.println("yes");
      else
        System.out.println("no");
	}
}