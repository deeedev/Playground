import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int arr [] = new int[size];
    for(int i=0;i<size;i++){
       arr[i] = sc.nextInt();
    }

    float median = findArrayMedian(arr,size);
    System.out.printf("The median of the array is %.2f",median);
  }

  public static float findArrayMedian(int [] arr, int size){
     int temp =0;
     float median = 0;

    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
           if(arr[j] > arr[i]){
          temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
       }
      }
    }

    if(size%2==1){
       median = arr[(int)size/2];
    }
    else{
       int a = arr[(int)size/2];
       int b = arr[(int)size/2-1];

      median = (a+b)/2;
    }

    return median;
  }
  }