package Hub2;
import java.util.Scanner;
public class LabSwitch4 {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   String meal_A = 
   "Chicken & Spaghetti",
   meal_B = "Hamburger & Fries",
   meal_C = "Cheesedog",
   meal_D = "Pizza",
   drink_S = "Small Drinks",
   drink_M = "Medium Drinks",
   drink_L = "Large Drinks";
   int mealPrice_A = 150,
   mealPrice_B = 145,
   mealPrice_C = 100,
   mealPrice_D = 80,
   drinkPrice_S = 30,
   drinkPrice_M = 35,
   drinkPrice_L= 40,
   quantity = 0,
   amount = 0;
   String meal , drink;
   try {
   System.out.print("Meal: ");
   meal = input.next();
   System.out.print("Drinks: ");
   drink = input.next();
   System.out.print("Quantity: ");
   quantity = input.nextInt();
   switch (meal.toUpperCase()) {
     case "A" :
     switch (drink.toUpperCase()) {
     case "S" :
     amount = (mealPrice_A + drinkPrice_S) * quantity;
     System.out.println("Order: " + meal_A + " " + drink_S);
     System.out.println("Amount: " + amount);   
     break;   
     case "M" :
     amount = (mealPrice_A + drinkPrice_M) * quantity;
     System.out.println("Order: " + meal_A + " & " + drink_M);
     System.out.println("Amount: " + amount);   
     break;
     case "L" :
     amount = (mealPrice_A + drinkPrice_L) * quantity;
     System.out.println("Order: " + meal_A + " & " + drink_L);
     System.out.println("Amount: " + amount);   
     break; 
     default : 
     System.out.println("Invalid Input");
     }
     break;
     case "B" :
     switch (drink.toUpperCase()) {
     case "S" :
     amount = (mealPrice_B + drinkPrice_S) * quantity;
     System.out.println("Order: " + meal_B + " & " + drink_S);
     System.out.println("Amount: " + amount);   
     break;   
     case "M" :
     amount = (mealPrice_B + drinkPrice_M) * quantity;
     System.out.println("Order: " + meal_B + " & " + drink_M);
     System.out.println("Amount: " + amount);   
     break;
     case "L" :
     amount = (mealPrice_B + drinkPrice_L) * quantity;
     System.out.println("Order: " + meal_B + " & " + drink_L);
     System.out.println("Amount: " + amount);   
     break; 
     default : 
     System.out.println("Invalid Input");
     }
     break;
     case "C" :
     switch (drink.toUpperCase()) {
     case "S" :
     amount = (mealPrice_C + drinkPrice_S) * quantity;
     System.out.println("Order: " + meal_C + " & " + drink_S);
     System.out.println("Amount: " + amount);   
     break;   
     case "M" :
     amount = (mealPrice_C + drinkPrice_M) * quantity;
     System.out.println("Order: " + meal_C + " & " + drink_M);
     System.out.println("Amount: " + amount);   
     break;
     case "L" :
     amount = (mealPrice_C + drinkPrice_L) * quantity;
     System.out.println("Order: " + meal_C + " & " + drink_L);
     System.out.println("Amount: " + amount);   
     break; 
     default : 
     System.out.println("Invalid Input");
     }
     break;
     case "D" :
     switch (drink.toUpperCase()) {
     case "S" :
     amount = (mealPrice_D + drinkPrice_S) * quantity;
     System.out.println("Order: " + meal_D + " & " + drink_S);
     System.out.println("Amount: " + amount);   
     break;   
     case "M" :
     amount = (mealPrice_D + drinkPrice_M) * quantity;
     System.out.println("Order: " + meal_D + " & " + drink_M);
     System.out.println("Amount: " + amount);   
     break;
     case "L" :
     amount = (mealPrice_D + drinkPrice_L) * quantity;
     System.out.println("Order: " + meal_D + " & " + drink_L);
     System.out.println("Amount: " + amount);   
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
