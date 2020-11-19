import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    
    int lenOfRope = l*2 + b*2;
    int QuantityOfCarpet = l*b;
    
    System.out.printf("%dm%n%dsqm",lenOfRope,QuantityOfCarpet);
    
  }
}