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
      
      int max_arr_element = MaxArrayElement(arr, size);
      System.out.println(max_arr_element+" is the maximum element in the array");
    }
  
  public static int MaxArrayElement(int [] arr,int size){
      int num=0;
    
    for(int i=0;i<=size-1;i++){
       if(num < arr[i])
         num = arr[i];
    }
    
    return num;
  }
}