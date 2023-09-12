package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class measurePracticeTest {

	measurePractice m = new measurePractice();
	@Test
	void testCntMeasure() {
		assertArrayEquals( new int[]{1,2,3,6}, m.cntMeasure(6));
	}

}
