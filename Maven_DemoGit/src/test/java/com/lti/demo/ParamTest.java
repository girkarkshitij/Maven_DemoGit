package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParamTest {

	@Disabled
	@ParameterizedTest
	@ValueSource(ints = {8,10,20,50,10})
	public void testArrays(int arg) {
		System.out.println("arg" + arg);
		Assertions.assertTrue(arg%2==0);
	}

	@Disabled
	@ParameterizedTest
	@DisplayName("Should pass all non null values.")
	@ValueSource(strings = {"Hello", "world"})
	public void testParam(String msg) {
		Assertions.assertNotNull(msg);
	}
	
	// login 3 attempts 
	
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x = 10, y=20;
		assertEquals(200,x*y);
	}
	
	@Test
	public void testLambda() {
		Integer[] intAry = {2,3,7,5,10};
		
		List<Integer> numbers = Arrays.asList(intAry);
		
		Assertions.assertAll(()-> assertEquals(2, numbers.get(0)),
							()-> assertEquals(3, numbers.get(1)),
							()-> assertEquals(7, numbers.get(2)),
							()-> assertEquals(5, numbers.get(3)),
							()-> assertEquals(10, numbers.get(4))
							);
	}
	
	@Test
	public void testExceptions() {
		Assertions.assertThrows( NumberFormatException.class, ()->{
			Integer.parseInt("One");});
	}
	
}

