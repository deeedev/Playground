import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      String type = sc.next();
      int tution_fee = sc.nextInt();
      int bus_fee = sc.nextInt();
      int hostel_fee = sc.nextInt();
      float total_fee;
      int percent = (150*tution_fee)/100;
      switch(type){
        case "MSDS":
          total_fee = tution_fee + bus_fee;
          System.out.printf("%.2f",total_fee);
          break;
        case "MSH":
          total_fee = tution_fee + hostel_fee;
          System.out.printf("%.2f",total_fee);
          break;
        case "MGSDS":
          total_fee = percent + bus_fee;
          System.out.printf("%.2f",total_fee);
          break;
        case "MGSH":
          total_fee = percent + hostel_fee;
          System.out.printf("%.2f",total_fee);
          break;
        default:
          System.out.println("Invalid");
      }
    }
}