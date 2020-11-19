import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String strCopy = String.copyValueOf(str.toCharArray());
      
      System.out.println(strCopy);
	}
}