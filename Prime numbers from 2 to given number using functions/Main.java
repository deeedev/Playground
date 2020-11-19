import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=2;i<=n;i++){
         if(isPrime(i)){
           System.out.println(i);
         }
      }
      
	}
    public static boolean isPrime(int a){
       boolean Isprime = true;
       int fact = 0;
       for(int i=2;i<=a;i++){
          if(a%i==0)
            fact++;
       }
        if(fact==1)
           Isprime = true;
        else
           Isprime = false;

     return Isprime; 
    }
}