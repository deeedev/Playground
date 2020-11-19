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
      
      if(l1_x<l2_y && l1_x<l3_z)
      {
      	System.out.println("L1");
      }
      else if(l2_y<l3_z)
      {
      	System.out.println("L2");
      }
      else
      {
      	System.out.println("L3");
      }
    }
}