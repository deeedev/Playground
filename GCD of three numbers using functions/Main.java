import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      
      int gcd  = GCD(n1,n2,n3);
      System.out.println(gcd);
	}
  
  public static int GCD(int a,int b,int c){
    int temp = 0;
    int gcd = 0;
    if(a>b && a>c)
      temp =a;
    else if(b>c)
      temp =b;
    else
      temp = c;
    
    for(int i=1;i<=temp;i++){
       if(a%i==0 && b%i==0 && c%i==0){
          if(gcd<i)
            gcd = i;
       }
    }
    return gcd;
  }
}