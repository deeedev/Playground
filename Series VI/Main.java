import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      
      for(int i = 1;count<n;i++){
         
        if(i%2==1){
          int num =(int) Math.pow(i,2) -1;
          System.out.print(num+" ");
        }
        if(i%2==0){
          int num =(int) Math.pow(i,2) -2;
          System.out.print(num+" ");
        }
        count++;
      }
      
	}
}