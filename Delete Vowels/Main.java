import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      String str1 = str.replaceAll("[aeiouAEIOU]","");
      System.out.println(str1);
    }
}