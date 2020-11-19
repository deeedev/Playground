import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      int n = sc.nextInt();
      
      if(n>x && n>y && n>z)
      {
         System.out.println("0");
      }
      else
      {
      	if(x>=n && y>=n && z>=n)
        {
           if(x<y && x<z)
           {
              System.out.println("L1");	
           }
           else if(y<z)
           {
              System.out.println("L2");
           }
           else
             System.out.println("L3");
        }
        else if(x>=n && y>=n || y>=n && z>=n || z>=n && x>=n)
        {
           if(x<y)
             System.out.println("L1");
           else
             System.out.println("L2");
          
          if(y<z)
            System.out.println("L2");
          else
            System.out.println("L3");
          
          if(z<x)
            System.out.println("L3");
          else
            System.out.println("L1");
        }
        else if(x>=n || y>=n || z>=n)
        {
           if(x>=n)
             System.out.println("L1");
          if(y>=n)
            System.out.println("L2");
          if(z>=n)
            System.out.println("L3");
        }
        else
          System.out.println("0");
      }
      
      
    }
}