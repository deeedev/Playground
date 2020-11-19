import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
            // fill your code
          Scanner sc = new Scanner(System.in);
          int n1 = sc.nextInt();
          int n2 = sc.nextInt();
          
          int sum = n1+n2;
          int differences = n1-n2;
          
          System.out.println(sum);
          System.out.println(differences);
        }
}