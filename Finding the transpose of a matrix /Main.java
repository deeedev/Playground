import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    
    int mat[][] = new int[r][c];
    
    for(int i=0;i<r;i++){
       for(int j=0;j<c;j++){
          mat[i][j] = sc.nextInt();
       }
    }
    
    transposeOfMatrix(mat,r,c);
  }
  
  public static void transposeOfMatrix(int [][] mat,int r, int c){
      int trans [][] = new int[c][r];
    
    for(int i=0;i<r;i++){
       for(int j=0;j<c;j++){
          trans[i][j] = mat[i][j];
       }
    }
    
    for(int i=0;i<c;i++){
       for(int j=0;j<r;j++){
          System.out.print(trans[i][j]+" ");
       }
      System.out.println();
    }
  }
}