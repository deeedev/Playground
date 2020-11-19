import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int a = 0,b=0,c=1;
      System.out.print(a+" "+b+" "+c+" ");
     
      while(n>3)
      {
        
      	int d = a+b+c;
        a = b;
        b = c;
        c = d;
        
        System.out.print(d+" ");
        n--;
      }
    }
}