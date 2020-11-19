import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder str1 = new StringBuilder();
      for(int i=str.length()-1;i>=0;i--){
         str1.append(str.charAt(i));
      }
      boolean check = true;
      for(int i=0;i<str.length();i++){
         if(str.charAt(i) != str1.charAt(i))
           check = false;
      }
      
      if(check)
        System.out.println("Palindrome");
      else
        System.out.println("Not a Palindrome");
      
	}
}