package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temperature = new  Temperature();
		
		double out=temperature.convertToFarenheit(0);
		assertEquals(32,out);
		
		double out1 = temperature.convertToCelsius(32);
		assertEquals(0,out1);
		
		double output=temperature.convertToFarenheit(10);
		assertEquals(40,output);
		
		double output1 = temperature.convertToCelsius(9);
		assertEquals(30,output1);
	}

}
