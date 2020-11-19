import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int square = n*n;
    int count = 0;
    
    while(temp>0){
      temp = temp /10;
      count++;
    }
    
    int divisor = (int)Math.pow(10,count);
    
    int digit_n = (int)square/divisor;
    int digit_n_1 = square%divisor;
    
    int sum = digit_n + digit_n_1;
    
    if(sum == n)
      System.out.println("Kaprekar Number");
    else
      System.out.println("Not a Kaprekar Number");
  }
}