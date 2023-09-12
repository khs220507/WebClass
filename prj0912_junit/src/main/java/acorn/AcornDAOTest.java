package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {
	AcornDAO dao = new AcornDAO();
	@Test
	void testSelectAll() {
		// fail("Not yet implemented");
		//assertTrue(dao.selectAll() != null);
		assertTrue(dao.selectAll().size() >=1);
	}
	@Test
	void testSelectAll2() {
		assertTrue(dao.selectAll2(new String[] {"mj", "yj"}).size()==2);
	}
}
