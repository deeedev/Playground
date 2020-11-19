import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  final float adult_price = 8;
      final float adult_matinee_price = 5;
      final float children_price = 4;
      final float children_matinee_price = 2;
      
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      float timings = sc.nextFloat();
      
      if(age>= 13 && timings< 12)
        System.out.printf("$%.2f",adult_price);
      else if(age >=13 && timings >12)
        System.out.printf("$%.2f",adult_matinee_price);
      else if(age<13 && timings <12)
        System.out.printf("$%.2f",children_price);
      else
		System.out.printf("$%.2f",children_matinee_price);
	}
}