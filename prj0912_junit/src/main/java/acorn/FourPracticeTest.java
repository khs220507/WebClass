package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourPracticeTest {

	FourPractice four = new FourPractice();
	
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(8, four.add(2, 6));
	}

	@Test
	void testSub() {
		//fail("Not yet implemented");
		assertEquals(8, four.sub(10, 2));
	}

	@Test
	void testMul() {
		//fail("Not yet implemented");
		assertEquals(8, four.mul(2, 4));
	}

	@Test
	void testDiv() {
		//fail("Not yet implemented");
		assertEquals(8, four.div(16, 2));
	}

}
