package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculateTest {
	Calculator c = new Calculator();
	
	@Test
	public void testAdd()
	{
		Assertions.assertEquals(300, c.add(100, 200));
	}
	

	
}
