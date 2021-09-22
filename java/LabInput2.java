package Hub2;
import java.util.Scanner;
public class LabInput2 {

  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
    double tens, ones;
    int hundreds, input;
   try {
    System.out.printf("Please enter a three-digit integer: ");
    input = console.nextInt();
    hundreds = input / 100;
    tens = (input % 100)/10;
    ones = input % 10;
    System.out.println("The value of num =  " + input);
    System.out.printf("%d hundreds ", hundreds);
    System.out.printf("%.0f tens ", tens);
    System.out.printf("%.0f ones" , ones);
  }catch (Exception e) {
    System.out.println("Invalid Input");
  }
  }

}
