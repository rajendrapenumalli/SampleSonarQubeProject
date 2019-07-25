package com.livevox;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class MathOperationsTest  {
	MathOperations cal=null;
    
	@Before
	public void setup() {
		cal=new MathOperations();
	}

	@Test
	public void testAdd() {
		int sum=cal.add(1,2);
		assertTrue(sum==3);
	}
}
	
