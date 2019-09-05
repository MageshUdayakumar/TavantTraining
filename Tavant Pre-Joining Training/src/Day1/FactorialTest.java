package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial factorial =new Factorial();
		
		/*success*/
		int out = factorial.CalculateFactorial(5);
		assertEquals(120,out);
		
		/*fail*/
		int out1 = factorial.CalculateFactorial(4);
		assertEquals(22,out1);
		
	}

}
