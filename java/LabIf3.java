package Hub2;
import java.util.Scanner;
public class LabIf3 {

  public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   double amount= 0, totalAmount = 0;
   String mode;
  try {
   System.out.printf("Amount: ");
   amount = console.nextDouble();
   System.out.printf("Mode: ");
   mode = console.next();
   
   if (mode.equalsIgnoreCase("cash")){
     
     totalAmount =  amount-(amount * 0.05);    
     }   
   else if (mode.equalsIgnoreCase("quarterly")){
     totalAmount = amount + (0.05 * amount);
     }
   else if (mode.equalsIgnoreCase("monthly")){
     totalAmount = amount + (0.07 * amount);
     }else {
       System.out.println("Invalid Input");
     }  
        
    System.out.printf("%.0f",totalAmount);      
  }catch (Exception e) {
    System.out.println("Invalid Input");
  }
  }
}
