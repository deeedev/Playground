import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      int middle_digit = 0;
      while(n>0){
        count++;
        int temp = n%10;
        n = n/10;
        
        if(count == 2)
          middle_digit = temp;
      }
      
      if(count == 3 && middle_digit % 3 == 0)
        System.out.println("Trendy Number");
      else
        System.out.println("Not a Trendy Number"); 
    }
}