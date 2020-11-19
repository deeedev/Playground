import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      
      
      boolean IsEven = (n%2==0?true:false);
     if(IsEven){
     	System.out.println("Even");
     }
      else
        System.out.println("Odd");
    }
}