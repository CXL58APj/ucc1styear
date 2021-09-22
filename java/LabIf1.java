package Hub2;
import java.util.Scanner;
public class LabIf1 {

  public static void main(String[] args) {
     int num;
     Scanner console = new Scanner(System.in);
     try {
     System.out.print("number: ");
     num = console.nextInt();
     if (num % 2 == 0)
     {
       System.out.println("Even");
     }
     else {
       System.out.println("Odd");
     }
     }catch (Exception e){
       System.out.println("Invalid Input");
     }
  }

}