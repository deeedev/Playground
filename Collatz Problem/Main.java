import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    System.out.println(n);
    while(n!=1)
    {
       if(n%2 != 0){
         n = 3*n+1;
         System.out.println(n);
       }
       else{
          n = n/2;
          System.out.println(n);
       }
      count++;
    }
    System.out.print(count);
  }
}