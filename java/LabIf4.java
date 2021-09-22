package Hub2;
import java.util.Scanner;
import java.util.*;

public class LabIf4 {

  public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   double km= 0, totalAmount = 0;
   int V_Class;
   int x=0;
   
   try {
   System.out.printf("Vehicle Class: ");
   V_Class = console.nextInt();
   
   if (V_Class >= 1 && V_Class <=3)  {
   System.out.printf("Kilometer: ");
   km = console.nextDouble();
   if (V_Class == 1){ 
     totalAmount =  41 + (km * 20);    
     }   
   if (V_Class == 2){
     totalAmount = 102 + (km * 35);
     }
   if (V_Class == 3){
     totalAmount = 122 + (km * 50);
     }  
      System.out.printf("Total Amount: %.0f",totalAmount);      
      }
    if (V_Class < 1 || V_Class >=3) {   
     System.out.println("Invalid Input");    
   }     
    }catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
