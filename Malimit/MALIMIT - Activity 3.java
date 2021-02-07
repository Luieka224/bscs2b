import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter temperature value in celsius: ");
      System.out.println(
      	convertTemp(input.nextDouble()) +""+
      	"\u00B0" + 'F'
      );
      input.close();
  }
  
  static double convertTemp(double temp) {
  	temp = 32 + (temp *= 1.8);
  	return temp;
  }
}