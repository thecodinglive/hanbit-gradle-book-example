package info.thecodinglive.integrationTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import info.thecodinglive.Calculator;

public class IntegTest {

	private Calculator calc;
	
	@Before
	public void setUp(){
		calc = new Calculator();
	}
	
	@Test
	public void IntegrateTestSum(){
		assertEquals(777, calc.sum(666, 111));
	}
}
