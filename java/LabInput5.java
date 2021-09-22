package Hub2;
import java.util.Scanner;
public class LabInput5 {

  public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   final double c2 = 2.997925E10;
   double energy, mass;
   try {
   System.out.printf("Please enter mass in grams: ");
   mass = console.nextDouble();
   
   System.out.printf("Energy is %E ergs", ((c2 * c2)*mass));
   
  }catch (Exception e){
    System.out.println("Invalid Input");
  }
}
}
