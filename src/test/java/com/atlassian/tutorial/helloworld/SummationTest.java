package com.atlassian.tutorial.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class SummationTest
{
	@Test
	public void AddTwoNumbersPass()
	{
		Summation sum = new Summation();
		assertTrue("expected <2> but was <"+sum.AddTwoNumbers(1, 1)+">", sum.AddTwoNumbers(1, 1) == 2);
	}

	@Test
	public void AddTwoNumberFail()
	{
		Summation sum = new Summation();
		assertTrue("This test deliberately fails!", sum.AddTwoNumbers(1, 1) == 3);
	}

}
