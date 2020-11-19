import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int sumOfDigit =0,productOfDigit = 0;
      
      for(int i = n; i<=m;i++){
         int a = i%10;
         int b = i/10;
        
         sumOfDigit = a+b;
         productOfDigit = a*b;
        
        if(sumOfDigit+ productOfDigit == i)
          System.out.println(i);
      }
      
      
      
    }
}