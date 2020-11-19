import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
	  int a = 0, b = 1, c=0; 
      
      for (int i = 3; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
      if(n==2)
         System.out.println(b);
      else
      System.out.println(c);
    
    }
}