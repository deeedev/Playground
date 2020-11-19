import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      final double cost_Blast_Rifle = 350.34;
      final double  cost_Visual_Sensor = 230.90;
      final double  cost_Auditory_Sensors = 190.55;
      final double  cost_Arms = 125.30;
      final double  cost_Legs = 180.90;
      final int budget = 15000;
      
      Scanner sc = new Scanner(System.in);
      
      int blastRifles = sc.nextInt();
      int visualSensor = sc.nextInt();
      int auditorySensors = sc.nextInt();
      int arms = sc.nextInt();
      int legs = sc.nextInt();
      
      double total_Cost = blastRifles*cost_Blast_Rifle + visualSensor*cost_Visual_Sensor + auditorySensors*cost_Auditory_Sensors + arms*cost_Arms + legs*cost_Legs;
      
      if(total_Cost <= budget)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}