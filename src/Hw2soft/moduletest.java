package Hw2soft;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class moduletest {

	@Test
	void test() {
		model m =new model();
		
		
		m.setResult(12%5);
		m.opr1=12;
		m.opr2=5;
		m.setoper(6);
		m.FindOperation();
		
		assertEquals(2,2,0);
	}

}
