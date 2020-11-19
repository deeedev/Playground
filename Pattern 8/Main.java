import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt(); int i=0,j=0;
       for(i=0;i<n;i++)
       {
         for(j=0;j<n;j++)
         {
           if(i==j || i==n-j-1)
           System.out.print("*");
           else
           System.out.print(" ");
         }
          System.out.println();
       }

    }
}