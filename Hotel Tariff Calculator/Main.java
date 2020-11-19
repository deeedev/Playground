import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      int month = sc.nextInt();
      float rent = sc.nextFloat();
      int days = sc.nextInt();
      float traffic;
      
      switch(month){
        case 1:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 2:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 3:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 4:
           traffic = (rent + rent * 20/100) * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 5:
           traffic = (rent + rent * 20/100) * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 6:
           traffic = (rent + rent * 20/100) * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 7:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 8:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 9:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 10:
           traffic = rent * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 11:
           traffic = (rent + rent * 20/100) * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        case 12:
           traffic = (rent + rent * 20/100) * (float) days;
           System.out.printf("%.2f",traffic);
        break;
        
        default:
           System.out.println("Invalid Input");
      }
      
	}
}