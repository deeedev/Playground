import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int r1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      int r2 = sc.nextInt();
      
      int c1c2 =(int) Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
      
      if(c1c2 == r1+r2)
        System.out.println("Tangential");
      else if(c1c2 < r1+r2)
        System.out.println("Overlap");
      else if(c1c2 > r1+r2)
        System.out.println("Do not overlap"); 
	}
}