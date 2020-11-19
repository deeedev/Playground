import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      if(n1>n2){
      		System.out.println(n1 +" greater than "+n2);
      }
      else if(n1<n2){
      		System.out.println(n1 +" less than "+n2);
      }
      else if(n1==n2){
      		System.out.println(n1 +" and "+n2+" are equal");
      }
    }
}