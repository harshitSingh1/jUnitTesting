package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestingPackage.jUnitFunction;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction Junit = new jUnitFunction();
		int result = Junit.addNumbers(200,500);
		assertEquals (700,result);
	}

}
