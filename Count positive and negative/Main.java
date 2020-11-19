import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count_negative = 0;
      int count_positive = 0;
      
      for(int i =0;i<n;i++){
        int m = sc.nextInt();
        
        if(m>=0)
          count_positive++;
        else
          count_negative++;
      }
      
      System.out.println("Number of positive numbers is "+count_positive+ " and the number of negative numbers is " +count_negative
);
    }
}