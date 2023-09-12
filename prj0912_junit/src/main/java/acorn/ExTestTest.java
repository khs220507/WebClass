package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExTestTest {

	ExTest t = new ExTest();
	@Test
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(8, t.add(3,5));
	}

}
