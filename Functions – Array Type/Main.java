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
    
    int type = arrayType(size,arr);
    
    if(type == 1)
      System.out.println("The array is Even");
    else if(type == 2)
      System.out.println("The array is Odd");
    else
      System.out.println("The array is Mixed");
  }
  
  public static int arrayType(int size,int [] arr){
     int type = 0;
     int oddcount = 0;
     int evencount = 0;
    
    for(int i=0;i<size;i++){
       if(arr[i]%2==0)
         evencount++;
       else if(arr[i]%2==1)
         oddcount++;
    }
    
    if(oddcount == size)
      type = 2;
    if(evencount == size)
      type = 1;
    if(oddcount >0 && evencount >0)
      type = 3;
    
    return type;
  }
}