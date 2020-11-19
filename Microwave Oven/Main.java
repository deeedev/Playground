import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      
      int item = sc.nextInt();
      float time = sc.nextFloat();
      
      if(item == 1)
        System.out.println(time);
      else if(item == 2)
        System.out.println(time+(time*50/100));
      else if(item == 3)
        System.out.println(time * 2);
      else
        System.out.println("Number of items is more");
                           
	}
}