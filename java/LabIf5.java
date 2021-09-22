package Hub2;
import java.util.Scanner;
public class LabIf5 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    
    double sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9, sub10, average;
    
    try {
    System.out.print("Subject 1: ");
    sub1 = console.nextDouble();
    if (sub1 > 100 || sub1 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 2: ");
    sub2 = console.nextDouble();
    if (sub2 > 100 || sub2 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 3: ");
    sub3 = console.nextDouble();
    if (sub3 > 100 || sub3 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 4: ");
    sub4 = console.nextDouble();
    if (sub4 > 100 || sub4 < 0 ) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 5: ");
    sub5 = console.nextDouble();
    if (sub5 > 100 || sub5 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 6: ");
    sub6 = console.nextDouble();
    if (sub6 > 100 || sub6 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 7: ");
    sub7 = console.nextDouble();
    if (sub7 > 100|| sub7 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 8: ");
    sub8 = console.nextDouble();
    if (sub8 > 100 || sub8 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 9: ");
    sub9 = console.nextDouble();
    if (sub9 > 100 || sub9 < 0) {
      System.out.println("Invalid Grade");
    }else {
    System.out.print("Subject 10: ");
    sub10 = console.nextDouble();
    if (sub10 > 100|| sub10 < 0) {
      System.out.println("Invalid Grade");
    }else {
    average = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8 + sub9 + sub10)/10;
    if (average >= 98) {
      System.out.printf("Average: %.1f\n", average);
      System.out.println("Scholarship Grant: President's List");
      System.out.println("Discount: 100%");
    }
    else if (average >=95){
    System.out.printf("Average: %.1f\n", average);
      System.out.println("Scholarship Grant: College Scholar");
      System.out.println("Discount: 50%");
    }
    else if (average >= 92) {
    System.out.printf("Average: %.1f\n", average);
    System.out.println("Scholarship Grant: Dean's List");
      System.out.println("Discount: 30%");
      }
    else {
    System.out.printf("Average: %.1f\n", average);
      System.out.println("Scholarship Grant: None");
      System.out.println("Discount: 0");
    }}}}}}}}}}}
    }catch (Exception e){
      System.out.println("Invalid Input");
    }
    
  }

}
