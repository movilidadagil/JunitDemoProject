package testdemo2;

import demo2.MathUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("MathUtil Test Case")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Junit5DiplayNameTest {
	
	@Test
	@DisplayName("MathUtil add test")
	void test_Add() {
		assertEquals(5, MathUtil.add(3, 2));
	}

	private void assertEquals(int i, int add) {
	}

	@Test
	@DisplayName("MathUtil multiply test")
	void test_Multiply() {
		assertEquals(15, MathUtil.multiple(3, 5));
	}

	@Test
	@DisplayName("MathUtil devide test")
	void test_Devide() {
		assertEquals(5, MathUtil.devide(25, 5));
	}
	
	@Test
	@DisplayName("MathUtil isPrime test")
	void test_IsPrime() {
		assertTrue(MathUtil.isPrime(13));
	}
}
