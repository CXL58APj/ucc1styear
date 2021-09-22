package Hub2;
import java.util.Scanner;
public class LabSwitch3 {

  public static void main(String[] args ) {
    Scanner i = new Scanner(System.in);
      double x, y;
      String z;
      try {
      System.out.print("grade: ");
      x = i.nextDouble();
      
      y = x / 10;
      z = Double.toString(y);
      if (x < 0) {
        System.out.println("Invalid Input");
      }else if (x >=101) {
        System.out.println("Invalid Input");
      }else if (x ==100) {
        System.out.println("Equivalent is: 1.0");
        }
        else if (x <= 74) {
        System.out.println("Equivalent is: 5.0");
        }else {
      switch (z) {
        case "7.5" : 
        case "7.6" :
        System.out.println("Equivalent is: 3.0"); break;
        case "7.7" :
        case "7.8" :
        case "7.9" :
        System.out.println("Equivalent is: 2.75"); break;
        case "8" :
        case "8.1" :
        case "8.2" :
        System.out.println("Equivalent is: 2.5"); break;
        case "8.3" :
        case "8.4" :
        case "8.5" :
        System.out.println("Equivalent is: 2.25"); break;
        case "8.6" :
        case "8.7" :
        case "8.8" :
        System.out.println("Equivalent is: 2.0"); break;
        case "8.9" :
        case "9" :
        case "9.1" :
        System.out.println("Equivalent is: 1.75"); break;
        case "9.2" :
        case "9.3" :
        case "9.4" :
        System.out.println("Equivalent is: 1.5"); break;
        case "9.5" :
        case "9.6" :
        case "9.7" :
        System.out.println("Equivalent is: 1.25"); break;
        case "9.8" :
        case "9.9" :
        case "10" :
        System.out.println("Equivalent is: 1"); break;
        default : 
        System.out.println("Invalid Input"); break;
      }
      }
      }catch (Exception e){
        System.out.println("Invalid Input");
      }
  }
}
