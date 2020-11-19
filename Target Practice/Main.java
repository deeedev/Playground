import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      Scanner sc = new Scanner(System.in);
      int target = sc.nextInt();
      int i;
      int score = 0;
      
      for(i=0; score<target;i++){
        int n = sc.nextInt();
        if(n<0){
          score = 0;
          break;
        }
        score += n;
      }
      
      
      System.out.println("The number of turns is " +i);
    }
}