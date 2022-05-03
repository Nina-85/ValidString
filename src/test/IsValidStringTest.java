package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import application.IsValidString;

class IsValidStringTest {

	@Test
	void testValid() {
		assertTrue(IsValidString.isValidString("{{{bghfg[[[ppp]]]}}}"));
		assertTrue(IsValidString.isValidString("{{{[[[]]]}}}"));
		assertTrue(IsValidString.isValidString("{[]({})}"));
		assertFalse(IsValidString.isValidString("{()[()}"));
		assertFalse(IsValidString.isValidString("zdcfdxfsd"));
		assertFalse(IsValidString.isValidString("g{{{[[[]]]}}}"));
		assertFalse(IsValidString.isValidString("{fdfxvcx}l"));	
	}
}
