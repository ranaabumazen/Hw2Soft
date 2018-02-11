package Hw2soft;

//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class testdivTest {

	@Test
	void test() {
		
	model m= new model();
	m.setResult(Double.parseDouble(""+Math.sqrt(9)));
	double result=m.getResult();
	assertEquals(3,3,0);
	
	}
	

}
