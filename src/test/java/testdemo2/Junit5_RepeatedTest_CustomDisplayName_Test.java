package testdemo2;

import demo2.MathUtil;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Junit5_RepeatedTest_CustomDisplayName_Test {
	
	@Test
	void test_Add() {
		System.out.println("test_Add()");
		assertEquals(5, MathUtil.add(3, 2));
	}
	
	@RepeatedTest(value = 1, name = RepeatedTest.SHORT_DISPLAY_NAME)
	void test_Multiply() {
		System.out.println("test_Multiply()");
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
	void test_Devide() {
		System.out.println("test_Devide()");
		assertEquals(5, MathUtil.divide(25, 5));
	}
	
	@RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
	void test_IsPrime() {
		System.out.println("test_IsPrime()");
		assertTrue(MathUtil.isPrime(13));
	}
}
