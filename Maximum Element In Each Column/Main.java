import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      int [][] arr = new int[row][col];
      
      for(int i=0;i<row;i++){
         for(int j=0;j<col;j++){
            arr[i][j] = sc.nextInt();
         }
      }
      
      MaxElementInColumn(arr,row,col);
	}
  public static void MaxElementInColumn(int [][] arr, int r, int c){
      for(int i=0;i<r;i++){
        int max = 0;
         for(int j=0;j<c;j++){
            if(max<arr[j][i])
              max = arr[j][i];
         }
        System.out.println(max);
      }
  }
}