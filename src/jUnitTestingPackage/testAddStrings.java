package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestingPackage.jUnitFunction;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jString = new jUnitFunction();
		String result = jString.addStrings("Harshit", "Singh");
		assertEquals("HarshitSingh",result);
	}

}
