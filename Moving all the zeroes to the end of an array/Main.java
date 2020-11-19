import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr [] = new int[size];
      int arr1 [] = new int[size];
      
      for(int i=0;i<size;i++){
         arr[i] = sc.nextInt();
      }
      int index = 0;
      for(int i=0;i<size;i++){
         if(arr[i] != 0){
           arr1[index] = arr[i];
           index++;
         }
      }
      
      for(int i=0;i<size;i++){
        System.out.print(arr1[i]+" ");
      }
    }
}