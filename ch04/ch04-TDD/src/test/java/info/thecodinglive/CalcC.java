package info.thecodinglive;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcC {

	private Calculator calc;
	
	/*
	@Test
	public void verifySetup(){
		assertNotNull(calc);
		System.out.println(calc.msg);
	}
	*/
	
	@Test
	public void testStaticSum(){
		//calc = new Calculator();
		assertEquals(777, calc.staticSum(666, 111));
	}
	

	
}
