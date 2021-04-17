package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting jstr= new jUnitTesting();
        String result= jstr.addstring("abc", "cda");
        assertEquals("abccda", result);

	}

}
