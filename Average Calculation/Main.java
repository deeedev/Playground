import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc = new Scanner(System.in);
      float m1 = sc.nextFloat();
      float m2 = sc.nextFloat();
      float m3 = sc.nextFloat();
      float m4 = sc.nextFloat();
      float m5 = sc.nextFloat();
      
      float avg = (m1+m2+m3+m4+m5)/5;
      System.out.printf("%.2f",avg);
    }
}