import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int arr [] = new int[size];

     for(int i =0;i<=size-1;i++){
        arr[i]=sc.nextInt();
     }

     float mean = meanOfArray(arr,size);

     System.out.printf("The mean of the array is %.2f", mean);

   }

   public static float meanOfArray(int [] arr, int size){
       float sum = 0;
       float mean = 0;

     for(int i=0;i<=size-1;i++){
        sum+=arr[i];
     }

     mean = sum/(float)size;
     return mean;
   }
 }