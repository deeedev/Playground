import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int size = sc.nextInt();
      int arr [] = new int[size];
      
      for(int i=0;i<size;i++){
         arr[i] = sc.nextInt();
      }
      
      int value = sc.nextInt();
      findPerfectCouple(arr,size,value);
    }
  
  public static void findPerfectCouple(int [] arr, int size, int value){
    int sum = 0; 
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
           if(arr[i]+arr[j] == value)
             System.out.println(arr[i]+", "+arr[j]);
        }
    }
  }
}