package Hw2soft;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testdiv {

	@Test
	void test() {
		
		model m =new model();
		m.setoper(1);
		m.opr1=3;
		m.opr2=4;
		m.FindOperation();
		assertEquals(7,7,0);
		
	}

}
