package info.thecodinglive;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

	private Calculator calc;
	
	@Before
	public void setup()throws Exception{
		calc  = new Calculator("hi juint");
	}
	
	
	@Test
	public void testSum(){
		//calc = new Calculator();
		assertEquals(777, calc.sum(666, 111));
	}
	
	
	@Test
	public void testStaticSum(){
		//calc = new Calculator();
		assertEquals(777, Calculator.staticSum(666, 111));
	}
	

	
}
