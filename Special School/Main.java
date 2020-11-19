import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      boolean check = true;
      
      int j = str2.length() - 1;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(j))
				check = false;
			j--;
		}
      
      if(check)
        System.out.println("It is same");
      else
        System.out.println("It is not same");
	}
}