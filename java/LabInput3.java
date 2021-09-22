package Hub2;
import java.util.Scanner;
public class LabInput3 {

  public static void main(String[] args) {
   double CARTON = 3.75, M_COST = 16.75,M_PROFIT = 11.90, milkAmount, totalCarton, totalCost, totalProfit;
   
   Scanner console = new Scanner(System.in);
   try {
   System.out.printf("Enter quantity of milk: ");
   milkAmount = console.nextDouble();
   totalCarton = milkAmount / CARTON;
   totalCost = milkAmount * M_COST;
   totalProfit = totalCarton * M_PROFIT;
   System.out.printf("Number of milk cartoons needed: %.0f\n" , totalCarton);
   System.out.printf("Cost of milk: PHP %,.2f\n", totalCost);
   System.out.printf("Profit of milk: PHP %,.2f\n", totalProfit);
  }catch (Exception e){
    System.out.println("Invalid Input");
  }
}
}
