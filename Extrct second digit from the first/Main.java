import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int count = 0;
    int count1 = 0;
    int temp1 = 0;
    while(temp>0)
    {
    	temp = temp/10;
        count++;
    }  
    while(count1 != count-1)
    {
    	temp1 = n%10;
        n = n/10;
        count1++;
    }  
    
    System.out.print(temp1);
  }
}