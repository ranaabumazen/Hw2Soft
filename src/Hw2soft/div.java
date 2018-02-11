package Hw2soft;

import static org.junit.Assert.*;

import org.junit.Test;

public class div {

	@Test
	public void test() {
	//fail("Not yet implemented");
		model m= new model();
		m.setResult(3.0);
		double result=m.getResult();
		assertEquals(3.0,result,0.0);
	}
	
	
	
	

}
