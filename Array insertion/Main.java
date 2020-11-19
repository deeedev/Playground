import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    
    for(int i=0;i<n;i++){
       arr[i] = sc.nextInt(); 
    }
         
    int pos = sc.nextInt();
    
    if(pos>=0 && pos<n){
    	int el = sc.nextInt();
        InsertNumber(arr,pos,el,n);
    }
    else
      System.out.println("Invalid Input");
  }
  
  public static void InsertNumber(int [] arr, int pos, int el, int n){
       int [] arr1 = new int[n+1];
    
    if(pos<=0 && pos>n)
      System.out.println("Invalid Input");
    else{
        for(int i=0;i<n+1;i++){
            if(i == pos-1){
               arr1[i] = el;
            }
          else if(i>pos-1)
            arr1[i] = arr[i-1];
          else
            arr1[i] = arr[i];
        }
    }
    
    for(int i=0;i<n+1;i++){
      
       System.out.println(arr1[i]);
    }
  }
        
}