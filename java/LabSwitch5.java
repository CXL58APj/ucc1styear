package Hub2;
import java.util.Scanner;
public class LabSwitch5 {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    
    String room;
    double amount, total;
    int code;
    try {
    System.out.print("Room Type: ");
    room = input.next();
    switch (room.toUpperCase()) {
      case "A" : 
      System.out.println("Room is Standard");
      System.out.print("Code of Payment: ");
      code = input.nextInt();
      switch (code) {
        case 1: 
        System.out.print("Cash");
        amount = (5000 + 1500) * 0.02;
        total = (5000 + 1500) - amount;
        System.out.print("Amount: " + ((int)total)); 
        break;
        case 2:
        System.out.print("Credit Card");
        amount = (5000 + 1500) * 0.05;
        total = (5000 + 1500) + amount;
        System.out.print("Amount: " + total); 
        break;
        default : 
        System.out.println("Invalid Input");
      }
      break;
      case "B" : 
      System.out.println("Room is DeLuxe");
      System.out.print("Code of Payment: ");
      code = input.nextInt();
      switch (code) {
        case 1: 
        System.out.print("Cash");
        amount = (15000 + 2000) * 0.02;
        total = (15000 + 2000) - amount;
        System.out.print("Amount: " + total); 
        break;
        case 2:
        System.out.print("Credit Card");
        amount = (15000 + 2000) * 0.05;
        total = (15000 + 2000) + amount;
        System.out.print("Amount: " + total); 
        break;
        default : 
        System.out.println("Invalid Input");
      }
      break;
      case "C" : 
      System.out.println("Room is Suite");
      System.out.print("Code of Payment: ");
      code = input.nextInt();
      switch (code) {
        case 1: 
        System.out.print("Cash");
        amount = (20000 + 3000) * 0.02;
        total = (20000 + 3000) - amount;
        System.out.print("Amount: " + total); 
        break;
        case 2:
        System.out.print("Credit Card");
        amount = (20000 + 3000) * 0.05;
        total = (20000 + 3000) + amount;
        System.out.print("Amount: " + total); 
        break;
        default : 
        System.out.println("Invalid Input");
      }
      break;
      default : 
      System.out.println("Invalid Input");
      }
    }catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
