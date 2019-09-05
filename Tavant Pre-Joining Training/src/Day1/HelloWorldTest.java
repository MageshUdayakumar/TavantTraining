package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld helloworld = new HelloWorld();
		/*success*/
		String output =helloworld.getMessage();
		assertEquals("HelloWorld",output);
		
		/*fail*/
		String output1 =helloworld.getMessage();
		assertEquals("HelloWorl",output1);
	}

}

