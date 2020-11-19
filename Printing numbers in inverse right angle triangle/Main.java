import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=n;i>0;i--){
      int num = i;
         for(int k=0;k<=(i-1);k++){
            System.out.print(num);
            num--;
         
         }
        System.out.println();
      }
	}
}