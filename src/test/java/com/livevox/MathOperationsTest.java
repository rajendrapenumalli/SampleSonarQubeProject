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

	@Test
	public void testMulti() {
		int prod=cal.multi(1,2);
		assertTrue(prod==2);
	}

	@Test
	public void testSub() {
		int diff=cal.sub(5,2);

		assertTrue(diff==3);
	}

	@Test
	public void testDiv() {
		int res=cal.div(5,2);
		assertTrue(res==2);
	}

}
	
