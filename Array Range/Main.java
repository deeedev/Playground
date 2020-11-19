import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    
    for(int i=0;i<n;i++){
       arr[i] = sc.nextInt();
    }
    
    int range = ArrayRange(arr,n);
    System.out.println("The range of the array is "+range);
  }
  
  public static int ArrayRange(int [] arr, int n){
    for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
           if(arr[i] >arr[j]){
               int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
           }
       }
    }
    
    int a = arr[n-1];
    int b = arr[0];
    
    return a-b;
    
    
  }
}