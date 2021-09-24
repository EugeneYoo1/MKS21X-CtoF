/*
The function should have doubles as parameters because temperatures can
be written as integers or decimals. The function should return a double
as well because its input is a double.
*/

public class CtoFTester{
  public static void main(String[] args) {
    double x = celsiusToFahrenheit(32.3);
    double y = fahrenheitToCelsius(40.1);
    System.out.printf("Your temperature in Farenheit is " + x);
    System.out.printf("Your temperature in Celsius is " + y);
  }

  private static double celsiusToFahrenheit(double c){
    return c * 9.0 / 5.0 + 32;
  }

  private static double fahrenheitToCelsius(double f){
    return (f - 32) * 5.0 / 9.0;
  }
}
