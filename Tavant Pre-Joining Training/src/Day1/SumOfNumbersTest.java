package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		
		SumOfNumbers sum =new SumOfNumbers();
		/*success*/
		int out = sum.SumOfEvenNumber(1, 10);
		assertEquals(30,out);
		
		int out1 = sum.SumOfOddNumber(1, 10);
		assertEquals(25,out1);

		/*fail*/
		int output = sum.SumOfEvenNumber(5, 10);
		assertEquals(21,output);
		
		int output1 = sum.SumOfOddNumber(5, 10);
		assertEquals(24,output1);
	}

}

