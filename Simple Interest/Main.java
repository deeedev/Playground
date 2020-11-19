import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc = new Scanner(System.in);
      int P = sc.nextInt();
      int T = sc.nextInt();
      float R = sc.nextFloat();
      
      float simpleInterest = (P*R*T)/100;
      System.out.printf("%.2f",simpleInterest);
    }
}