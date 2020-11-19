import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sumOfOdd = 0;
      int sumOfEven = 0;
      while(n>0){
        int num = n%10;
        if(num%2==0)
          sumOfEven+=num;
        else
          sumOfOdd+=num;
        
        n = n/10;
      }
      
      if(sumOfEven == sumOfOdd)
        System.out.println("yes");
      else
        System.out.println("No");
    }
}