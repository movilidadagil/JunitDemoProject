package testdemo1;

import demo1.MyTestClass;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestMyTestClass {

	private MyTestClass _testObject;


	/*
	we extracted a result from priority or order scenarios
	it is not guaranteed order run for junit methods.
	 */

	@BeforeEach
	public void setUp() {
		_testObject = new MyTestClass();
		System.out.println("before each first");
	}

	@BeforeEach
	public void setUpb() {
		_testObject = new MyTestClass();
		System.out.println("before each seconds");
	}


	@Test
	public void assureThatDoSomethingReturnsParsedStringForHighParam2Values() {
		int returned = _testObject.doSomething("1234", 10);
		assertThat(returned, is(1234));
		returned = _testObject.doSomething("4567", Integer.MAX_VALUE);
		assertThat(returned, is(4567));
	}



	@Test
	public void assureThatDoSomethingReturnsLowValueInts() {
		int returned = _testObject.doSomething("", 0);
		assertThat(returned, is(0));
		returned = _testObject.doSomething("", 9);
		assertThat(returned, is(9));
		returned = _testObject.doSomething("", Integer.MIN_VALUE);
		assertThat(returned, is(Integer.MIN_VALUE));
	}
	@Test
	public void assureThatDoSomethingThrowsExceptionForNonParseableString() {
		assertThrows(NumberFormatException.class, () -> 
		_testObject.doSomething("+-*~", 10));
	}
}
