package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactTest {

	@Test
	void test() {
		Factorial fact =new Factorial();
		int out = fact.CalculateFactorial(5);
		assertEquals(120,out);
		int out1 = fact.CalculateFactorial(4);
		assertEquals(22,out1);
		
	}

}
