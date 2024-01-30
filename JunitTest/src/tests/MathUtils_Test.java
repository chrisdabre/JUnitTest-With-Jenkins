package tests;

import static org.junit.Assert.*;

import org.junit.Test;


public class MathUtils_Test {

	@Test
	public void test() {
		MathUtils obj = new MathUtils();
		int add = obj.add(4, 5);
		assertEquals(9, add);
		
		int subtract = obj.subtract(8, 5);
		assertEquals(3, subtract);
		
		int multiply = obj.multiply(2, 5);
		assertEquals(10, multiply);
		
		int square = obj.square(6);
		assertEquals(36, square);

		
	}

}
