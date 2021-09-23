/*
The function should have doubles as parameters because temperatures can
be written as integers or decimals. The function should return a double
as well because its input is a double.
*/

public class CtoFTester{
  public static void main(String[] args) {
    double x = celsiusToFahrenheit(32.3);
    System.out.printf("Your temperature in Farenheit is " + x);
  }

  private static double celsiusToFahrenheit(double c){
    return c * 9.0 / 5.0 + 32;
  }
}
