import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      float speed = sc.nextFloat();
      float distance = sc.nextFloat();
      float time_to_turn_red = sc.nextFloat();
      
      float time_in_sec = (distance/speed)*3600;
      if(time_in_sec < time_to_turn_red)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}