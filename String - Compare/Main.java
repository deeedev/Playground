import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      
      if(str1.equals(str2))
        System.out.println("Strings are same");
      else
        System.out.println("Strings are not same");
	}
}