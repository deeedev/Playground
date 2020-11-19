import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int product = n1*n2;
      int quotient = n1/n2;
      int remainder = n1%n2;
      
      System.out.println(product);
      System.out.println(quotient);
      System.out.println(remainder);
    }
}