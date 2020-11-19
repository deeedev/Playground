import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr [] = new int[size];
      
      for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();
      }
      
      for(int i=0;i<size;i++){
         for(int j=i+1;j<size;j++){
             for(int k=j+1;k<size;k++){
                System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+")"+" ");
             }
         }
        if(i<size-1)
          System.out.println();
      }
    }
}