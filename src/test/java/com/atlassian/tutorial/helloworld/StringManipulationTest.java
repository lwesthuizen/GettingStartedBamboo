package com.atlassian.tutorial.helloworld;

import org.junit.Test;

public class StringManipulationTest
{
	@Test
	public void testToUpperCasePass()
	{
		StringManipulation sm = new StringManipulation();
		equals(sm.toUpperCasePass("word").equals("WORD"));
	}

	@Test
	public void testToUpperCaseFail()
	{
		StringManipulation sm = new StringManipulation();
		equals(sm.toUpperCaseFail("word").equals("WORD"));
	}

}
