import java.util.Scanner;
import java.lang.Math;

class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int power = sc.nextInt();
      
      Double pow = Math.pow(base,power);
      //System.out.println(pow);
      System.out.format("%.0f",pow);
    }
}