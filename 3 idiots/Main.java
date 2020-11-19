import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    
    float midX1 = ((float)x1+(float)x2)/2;
    float midY1 = ((float)y1+(float)y2)/2;
    
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",midX1,midY1);
  }
}