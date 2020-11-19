import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      
      int birth_year = sc.nextInt();
      int current_year = sc.nextInt();
      
      if(current_year>birth_year)
      {
      	int age = (1900 + current_year) - (1900+birth_year);
      	System.out.println(age);
      }
      else
      {
      	int age = (2000 + current_year) - (1900+birth_year);
      	System.out.println(age);
      }
    }
}