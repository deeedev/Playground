import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
      int col = sc.nextInt();
      int[][] arr = new int[rows][col];
      
      for(int i=0;i<rows;i++){
         for(int j=0;j<col;j++){
            arr[i][j] = sc.nextInt();
         }
      }
      int max = 0;
      for(int i=0;i<rows;i++){
         for(int j=0;j<col;j++){
           if(max<arr[i][j])
             max = arr[i][j];
         }
      }
      
      System.out.print(max);
	}
}