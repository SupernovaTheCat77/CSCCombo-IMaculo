
/**************************************************************************************************
 *  This is a practice program, it reads Fahrenheit temperatures and outputs Celsius and Kelvin.  *
 *  Written by: Izzy Maculo                                                                       *
 *  Date: 9/8/23                                                                                  *
 *************************************************************************************************/

import java.util.Scanner;

public class TemperatureConversion {
	
	public static void main(String[] args) {
		
		double fahren;
		double celsius;
		double kelvin;
		
		fahren = getTemp();
		celsius = findCelsius(fahren);
		kelvin = findKelvin(fahren, celsius);
		outTemp(fahren, celsius, kelvin);
	}
	
	public static void outTemp(double fTemp, double cTemp, double kTemp) {
		System.out.printf("\nFahrenheit: %.2f", fTemp);
		System.out.printf("\nCelsius: %.2f", cTemp);
		System.out.printf("\nKelvin: %.2f", kTemp);
	}
	
	public static double getTemp() {
		Scanner input = new Scanner(System.in);
		double fTemp;
		
		System.out.print("Input temperature in Fahrenheit: ");
		fTemp = input.nextDouble();
		return fTemp;
	}
	
	public static double findCelsius(double fTemp) {
		double celsius = (fTemp - 32) * 5/9;
		return celsius;
	}
	
	public static double findKelvin(double fTemp, double cTemp) {
		double kelvin = cTemp + 273.15;
		return kelvin;
	}
}
