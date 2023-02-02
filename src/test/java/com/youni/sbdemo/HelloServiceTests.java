package com.youni.sbdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloServiceTests {
	HelloService helloService = new HelloService();

	@Test
	public void testCalculateSum() {
		assertEquals(helloService.calculateSum(50, 50), 100);
		assertEquals(helloService.calculateSum(10, 20), 30);
		assertEquals(helloService.calculateSum(30, 30), 60);
	}

	@Test
	public void testCalculateSum2() {
		assertEquals(helloService.calculateSum(20, 30), 50);
		assertEquals(helloService.calculateSum(30, 30), 60);
	}
}
