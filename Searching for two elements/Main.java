import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc =new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      
      for(int i=0;i<=size-1;i++){
         arr[i] = sc.nextInt();
      }
      
      int search_elm1 = sc.nextInt();
      int search_elm2 = sc.nextInt();
      int check1 = 0;
      int check2 = 0;
      for(int i=0;i<=size-1;i++){
         if(search_elm1 == arr[i])
            check1 = i;
        if(search_elm2 == arr[i])
            check2 = i;
      }
      
      if(check1!=0)
        System.out.println(check1);
      else
        System.out.println("-1");
      
      if(check2!=0)
        System.out.println(check2);
      else
        System.out.println("-1");
    }
}