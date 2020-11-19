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
      
      System.out.println(str1);
                      
                      
	}
}