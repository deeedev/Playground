import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int temp = n;
    int reverse = 0;
    int d = 0;
    
    while(temp>0){
      d = temp%10;
      temp = temp/10;
      reverse = reverse*10+d;
      
    }
    
    System.out.println(reverse);
  }
}