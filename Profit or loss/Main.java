import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
      float total_Cost = sc.nextFloat();
      float sold_Cost_Per_Bannana = sc.nextFloat();
      float total_Sell_cost = sold_Cost_Per_Bannana * 12;

      if(total_Cost<total_Sell_cost)
      {
        float profit = total_Cost - total_Sell_cost;
          System.out.printf("Profit : Rs.%.2f",profit);
      }
      else if(total_Cost>total_Sell_cost)
      {
          float loss = total_Cost - total_Sell_cost;
          System.out.printf("Loss : Rs.%.2f",loss);
      }
      else if(total_Cost == total_Sell_cost)
        System.out.println("No profit nor loss");
    }
}