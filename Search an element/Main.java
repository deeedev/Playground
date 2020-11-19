import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr [] = new int[size];
      
      for(int i=0;i<=size-1;i++){
         arr[i] = sc.nextInt();
      }
      
      int elem = sc.nextInt();
      
      if(search_elem(arr,elem,size))
         System.out.println(elem+" is present in the array");
      else
         System.out.println(elem+" is not present in the array");
    }
  public static boolean search_elem(int [] arr,int elem, int size){
     boolean check = false;
    
    for(int el : arr){
       if(el == elem)
         check = true;
    }
    
    return check;
  }
}