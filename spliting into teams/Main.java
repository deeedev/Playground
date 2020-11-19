import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
  Scanner sc = new Scanner(System.in);
  int noOfStudent = sc.nextInt();
  int noOfTeams = sc.nextInt();
  
  int noOfStudentInTeam = noOfStudent/ noOfTeams;
  int noOfRemainingStudent = noOfStudent% noOfTeams;

 System.out.println("The number of students in each team is " +noOfStudentInTeam+" and left out is "+noOfRemainingStudent);
}
  
}