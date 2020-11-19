import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int table = sc.nextInt();
      int rows = sc.nextInt();
      int i=1;
      while(i<=rows){
        int multiply = table*i;
        
        System.out.println(i+"*"+table+"="+multiply);
        i++;
      }
      
    }
}