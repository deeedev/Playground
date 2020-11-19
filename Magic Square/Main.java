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
      
      boolean IsMagicNumber = MagicNumber(arr,n);
      
      if(IsMagicNumber)
        System.out.println("yes");
      else
        System.out.println("no");
	}
  
  public static boolean MagicNumber(int [][] arr, int n){
      int FirstRowSum = 0;
    int LastRowSum = 0;
    int FirstColSum = 0;
    int LastColSum = 0;
    int diag1Sum =0;
    int diag2Sum = 0;
    
     for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==0)
                FirstRowSum += arr[i][j];
             if(i==n-1)
               LastRowSum += arr[i][j];
            if(j==0)
              FirstColSum += arr[i][j];
            if(j==n-1)
              LastColSum += arr[i][j];
            if(i==j)
              diag1Sum += arr[i][j];
            if(i == n-j-1)
              diag2Sum += arr[i][j];
          }
      }
    if(FirstRowSum == LastRowSum && LastRowSum == FirstColSum && FirstColSum == LastColSum && LastColSum == diag1Sum && diag1Sum == diag2Sum)
      return true;
    else
      return false;
    
  }
}