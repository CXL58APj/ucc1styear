package Hub2;
import java.util.Scanner;
public class LabInput4 {

  public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     String itemName;
     double lastPrice, thisPrice, inflation;
     try {
     System.out.printf("Please enter the name of the item: ");
     itemName= console.nextLine();
     System.out.printf("Enter its price last year: ");
     lastPrice = console.nextDouble();
     System.out.printf("Enter its price this year: ");
     thisPrice = console.nextDouble();
     System.out.print("The inflation rate of " + itemName  + ": ");
     System.out.printf("%,.2f", ((thisPrice - lastPrice)/ thisPrice));
  }catch (Exception e){
    System.out.println("Invalid Input");
  }
}
}
