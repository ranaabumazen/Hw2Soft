package Hw2soft;

//
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class testdivTestTest {

	 @Test
	void test() {
		
		model m =new model();
		
		
		m.setResult(12/2);
		assertEquals(6,m.getResult(),0);
		
	}

}
