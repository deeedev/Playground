import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int column = sc.nextInt();
      int tree = sc.nextInt();
      
      if(tree <= column ||tree % column == 1 || tree % column == 0)
        System.out.println("Yes");
      else
        System.out.println("No");        
      
     }
}