import java.util.*;
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
    
    int Odd_sum = sumOfOddNumbers(arr,size);
    int Even_sum = sumOfEvenNumbers(arr,size);
    
    System.out.println("The sum of the even numbers in the array is "+Even_sum);
    System.out.println("The sum of the odd numbers in the array is "+Odd_sum);
  }
  
  public static int sumOfOddNumbers(int[] arr, int size){
     int sum = 0;
    
    for(int i=0;i<=size-1;i++){
        if(arr[i] % 2 == 1)
          sum += arr[i];
    }
    
    return sum;
  }
  
  public static int sumOfEvenNumbers(int[] arr, int size){
     int sum = 0;
    
    for(int i=0;i<=size-1;i++){
        if(arr[i] % 2 == 0)
          sum += arr[i];
    }
    
    return sum;
  }
}