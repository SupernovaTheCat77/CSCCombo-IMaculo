
/**************************************************************************************************
 *  This is a practice program, it reads Fahrenheit temperatures and outputs Celsius and Kelvin.  *
 *  Written by: Izzy Maculo                                                                       *
 *  Date: 9/8/23                                                                                  *
 *************************************************************************************************/

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double fahren;
		double celsius;
		double kelvin;
		double celsiusConvert = 5/9; //Multiply to get Fahrenheit to Celsius, not including the subtraction of 32
		double kelvinConvert = 273.15; //Add to get Celsius to Kelvin
		
		System.out.print("Input temperature in Fahrenheit: ");
		fahren = input.nextDouble();
		celsius = (fahren - 32) * celsiusConvert;
		kelvin = celsius + kelvinConvert;
		
		System.out.printf("\nFahrenheit: %.2f", fahren);
		System.out.printf("\nCelsius: %.2f", celsius);
		System.out.printf("\nKelvin: %.2f", kelvin);
	}
}
