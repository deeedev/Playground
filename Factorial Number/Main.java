import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i = 1;
      int quotient =0;
      
      while(n%i == 0){
      	quotient = n / i;
        int temp = quotient;
        n = temp;
        i++;
        
      }
      
      if(quotient == 1)
        System.out.println("Yes");
      else
        System.out.println("No");
      
      
    }
}