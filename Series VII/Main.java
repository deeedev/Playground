import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      float a = 1; float b= 2,c=3,d;
	  if(n==1)
         System.out.print((int)a);
      else if(n==2)
        System.out.print((int)a+" "+b);
      else
      System.out.print((int)a+" "+b+" "+c+" ");
      
      for(int count=3;count<n;count++){
        
        if(count%2==1){
          d = a+b+c;
          a=b;
          b=c;
          c=d;
          
          System.out.print(d+" ");
          //count++;
        }
        
        if(count%2==0){
          d = b+c;
          a=b;
          b=c;
          c=d;
          
          System.out.print(d+" ");
          //count++;
        }
        
      }
	}
}