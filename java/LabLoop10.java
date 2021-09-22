package Hub2;

public class LabLoop10 {

  public static void main(String[] args) {
  int j = 12, num1 = 0, num2 = 1;

        for (int i = 1; i <= j; ++i)
        {
            System.out.print(num1+" ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
  }

}
