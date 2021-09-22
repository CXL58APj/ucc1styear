package Hub2;
import java.util.Scanner;
public class LabSwitch2 {

  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
 
 double age0;
  int age;
  try {
  System.out.print("Age: ");
  age0 = console.nextDouble();
  if (age0 <0 )
       System.out.println("Invalid Input");
       else {
  age = (int)age0 / 10;
   if (age0 <=12 )
     System.out.print("Kids");
     
     else if 
       (age0 >=60 )
       System.out.println("Senior Citizen");
     
   else {
  switch (age){
    case 1:
    System.out.print("Teenage"); break;
    case 2:
    case 3: 
    System.out.print("Youth"); break;
    case 4:
    case 5:
    System.out.print("Adults"); break;
    default: 
    System.out.println("Invalid Input"); break;
    }}
    
  }
  }catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
