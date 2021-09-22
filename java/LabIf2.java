package Hub2;
import java.util.Scanner;
public class LabIf2 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);    
    
    char i;
    String in;
    System.out.print("character: ");
    in = console.next();
    if (in.length() >=2 ){
      System.out.println("Invalid Single Character");
    }else {
    i = in.charAt(0);      
    
    if (i == 'a'|| i == 'e' || i=='i' || i=='o' || i=='u'|| i=='A' || i=='E' || i=='I' || i =='O' || i=='U') {
      System.out.println("Vowel");
    }else if ((i > 'a' && i < 'z') || (i > 'A'  && i < 'Z')){
      System.out.println("Consonant");
    }else {
      System.out.println("not a letter");
    }
  }
}
}
