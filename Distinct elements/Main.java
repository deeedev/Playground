import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr =  new int[size];
    
    for(int i=0;i<=size-1;i++){
       arr[i] = sc.nextInt();
    }
    
    int num = findDistinctElement(arr,size);
    System.out.println(num);
    
  }
  
  public static int findDistinctElement(int [] arr, int size){
  int count = 5;
     for(int i=0;i<=size-1;i++){
        for(int j=i+1;j<=size-1;j++){
           if(arr[i] == arr[j])
             count--;
        }
     }
    return count;
  }
}