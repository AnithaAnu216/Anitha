package com.capgemini.HealthCare;

import org.junit.Test;

import junit.framework.TestCase;

public class DemoTest extends TestCase {
	Demo d = new Demo();
@Test
	public void testAdd() {
		assertEquals(10,d.add(2, 3));
	}

}
