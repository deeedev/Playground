import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int column = sc.nextInt();
      int tree = sc.nextInt();
      
      boolean check = false;
      int i = 0;
      
      while(check == false && i<=row) 
      {
         if(tree <= row ||tree == row * i +1 || tree >= (row * (column-1) +1 ) && tree <= row*column)
         {
           check = true;  
         }
        i++;
      }
      
      if(check)
        System.out.println("yes");
      else
       System.out.println("No");
     }
}