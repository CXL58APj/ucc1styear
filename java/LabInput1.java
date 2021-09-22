package Hub2;
import java.util.Scanner;
public class LabInput1 {

  public static void main(String[] args) {
    
  Scanner console = new Scanner (System.in);
      int m2h = 60, s2m = 60, sec, sec1, min, hr;
      try {
      System.out.print("Please Enter number of seconds: ");
      sec = console.nextInt();
      
      sec1 = sec;
      min = sec / s2m;
      sec -= min * s2m; 
      
      hr = min / m2h;
      min -= hr * m2h;
      
      System.out.println(sec1 + " seconds = " + hr + ":" + min + ":" + sec);
  
      }catch (Exception e){
        System.out.println("\nInvalid Input");
      }
      }
}
