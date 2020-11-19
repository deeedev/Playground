import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int l1_x = sc.nextInt();
      int l2_y = sc.nextInt();
      int l3_z = sc.nextInt();
      int n = sc.nextInt();
      
      if(n<=l1_x && n<=l2_y && n<=l3_z)
      {
      	System.out.println("3");
      }
      else if(n<=l1_x && n<=l2_y || n<=l2_y && n<=l3_z || n<=l1_x && n<=l3_z)
      {
      	System.out.println("2");
      }
      else if(n<=l1_x || n<=l2_y || n<=l3_z)
      {
        System.out.println("1");
      }
      else
      {
      	System.out.println("0");
      }
      
    }
}