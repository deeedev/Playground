import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = 1;
      for(int i=1;i<=n;i++){
      
         for(int j=i;j<=n-1;j++){
            System.out.print(" ");
         }
        
         for(int k=1;k<=i;k++){
            System.out.print(num+" ");
            num++;
         }
        System.out.println();
      }
    }    
}