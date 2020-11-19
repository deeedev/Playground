import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr = new int[size];
    
    for(int i=0;i<=size-1;i++){
       arr[i] = sc.nextInt();
    }
    
    isPerfectBatch(arr,size);
  }
  
  public static void isPerfectBatch(int[] arr, int size){
   
     int batch_sum = arr[0] + arr[1] + arr[2];
     boolean check = false;
    
    for(int i=3;i<=size-1;i=i+3){
       int curr_batch_sum = arr[i] + arr[i+1] + arr[i+2];
       if(curr_batch_sum == batch_sum){
         check = true;
       }
       else{
        check = false;
       }
    }
    
    if(check)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}