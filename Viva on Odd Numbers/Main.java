import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      
      int count = 0;
      double score = 0;
      while(count!=3){
        int n = sc.nextInt();
         if(n%2!=0){
           count++;
           score++;
         }
         else if(n<0){
           score = score - 1;
           break;
         }
         else if(n%2 ==0)
           score = score - 0.5;
      }
      System.out.println(score);
      
    }
}