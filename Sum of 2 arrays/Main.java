import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      
      int [] arr_1 = new int[size];
      int [] arr_2 = new int[size];
      
      for(int i=0;i<=size-1;i++){
         arr_1[i] = sc.nextInt();
      }
      
      for(int i=0;i<=size-1;i++){
         arr_2[i] = sc.nextInt();
      }
      
      sumOfArrays(arr_1,arr_2,size);
    }
  
  public static void sumOfArrays(int [] arr_1, int [] arr_2,int size){
  
      for(int i=0;i<=size-1;i++){
         for(int j=i;j<=i;j++){
            int num = arr_1[i] + arr_2[i];
           System.out.println(num);
             
         }
        
      }
  }
}