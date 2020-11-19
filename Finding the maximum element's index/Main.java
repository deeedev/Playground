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
    
    int index = maxElementIndex(arr,size);
    System.out.println(index);
  }
  
  public static int maxElementIndex(int[] arr,int size){
     int max_index = 0;
     int max_elem = 0;
    
    for(int i=0;i<=size-1;i++){
        if(max_elem<arr[i])
          max_elem = arr[i];
    }
    
    for(int i=0;i<=size-1;i++){
       if(max_elem == arr[i])
         max_index = i;
    }
    
    return max_index;
  }
}