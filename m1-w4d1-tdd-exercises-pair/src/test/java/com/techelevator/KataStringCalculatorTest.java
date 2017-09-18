package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	KataStringCalculator sut;

	@Before
	public void Setup() {
		
		sut = new KataStringCalculator();
		
	}	
	@Test
	public void testEmptyString() {
		
		int x=sut.add(sut.output(""));
		assertEquals(0, x);
					
	}
	@Test
	public void testStringLengthOne() {
		
		int x=sut.add(sut.output("1"));
		assertEquals(1, x);
			
	}
	@Test
	public void testStringLengthTwo() {
		
		int x=sut.add(sut.output("1,7"));
		assertEquals(8, x);
		
	}
	@Test
	public void testStringLengthNine() {
		
		int x=sut.add(sut.output("1,7,12,4,8,20,78,0,420"));
		assertEquals(550, x);
	}
	@Test
	public void testStringLengthNewDelimter() {
		int x=sut.add(sut.output("1/n7"));
		assertEquals(8, x);
	}
	
}