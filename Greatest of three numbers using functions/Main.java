import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      
      int num = greatestOfThreeNumber(n1,n2,n3);
      System.out.println(num);
      
	}
  
  public static int greatestOfThreeNumber(int a,int b,int c){
      if(a>b && a>c)
        return a;
      else if(b>c)
        return b;
      else
        return c;
  }
}