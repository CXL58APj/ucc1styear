package Hub2;
import java.util.Scanner;
public class LabSwitch1 {

  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
  int num;
  try {
  System.out.print("Day of Week in Number: ");
  num = console.nextInt();
  switch (num) {
    case 1: 
    System.out.println("Monday"); break;
    case 2:
    System.out.println("Tuesday"); break;
    case 3:
    System.out.println("Wednesday"); break;
    case 4: 
    System.out.println("Thursday"); break;
    case 5: 
    System.out.println("Friday"); break;
    case 6:
    System.out.println("Saturday"); break;
    case 7: 
    System.out.println("Sunday"); break;
    default : 
    System.out.println("Invalid Input"); break;
  }
  }catch (Exception e){
    System.out.println("Invalid Input");
  }
  }

}
