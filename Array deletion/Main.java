import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
    
    int pos = sc.nextInt();
    
    if(pos<=0 || pos>n)
      System.out.print("Invalid Input");
    else
      DeleteArrayElelemt(arr,pos,n);
  }
  
  public static void DeleteArrayElelemt(int [] arr, int pos, int n){
      int arr1 [] = new int[n-1];
    
    for(int i =0;i<n-1;i++){
      if(i<pos-1)
        arr1[i] = arr[i];
      else if(i==pos-1)
        arr1[i] = arr[i+1];
    }
    
    System.out.println("Array after deletion is");
    for(int i =0;i<n-1;i++){
      System.out.println(arr1[i]);
    }
  }
}