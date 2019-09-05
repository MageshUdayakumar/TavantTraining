package day1;

import java.util.Scanner;

public class Temperature {

	  public double convertToFarenheit(double celsius)
	{
		return (celsius*9/5)+32;
	}
	  public double convertToCelsius(double farenheit)
	{
		return (farenheit-32)*5/9;
	}
	
	public static void main(String[] args) {
      
      Scanner scanner= new Scanner(System.in);
      System.out.println("Celsius =" );
      double celsius,farenheit;
      celsius=scanner.nextDouble();
      System.out.println("Fahrenheit =" );
      farenheit=scanner.nextDouble();
      Temperature temperature =new Temperature();
      System.out.println(" Convert To Fahrenheit ="+temperature.convertToFarenheit(celsius));
      System.out.println(" Convert To Celsius ="+temperature.convertToCelsius(farenheit));
      scanner.close();

	}

}
