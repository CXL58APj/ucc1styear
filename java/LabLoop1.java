package Hub2;

public class LabLoop1 {

  public static void main(String[] args) {
    int a = 0;
    for (int i = 1 ; i <= 10; i++) {
      for (int j = 1; j <= 10; j++){
        a = i * j;
        System.out.print(a + " " );
        
      }
      System.out.println(" ");
    }
  }

}
