import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr_1 = new int[size];
    int [] arr_2 = new int[size];
    
    for(int i=0;i<=size-1;i++){
       arr_1[i] = sc.nextInt();
    }
    
    for(int i=0;i<=size-1;i++){
       arr_2[i] = sc.nextInt();
    }
    
    if(CheckCompatible(arr_1,arr_2,size)){
       System.out.println("Compatible");
    }
    else
      System.out.println("Incompatible");
  }
  
  public static boolean CheckCompatible(int [] arr_1, int [] arr_2,int size){
  	boolean check = true;
    
    for(int i=0;i<=size-1;i++){
           if(arr_1[i] < arr_2[i])
             check = false;
    }
    return check;
  }
}