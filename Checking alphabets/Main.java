import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      char c = sc.next().toLowerCase().charAt(0);
      
      if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
      {  
         if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u')
      	{
         System.out.println("Vowel");
      	}
      	else
      	{
         System.out.println("Consonant");
      	}
      }
      else
        System.out.println("Not an alphabet");
    }
}