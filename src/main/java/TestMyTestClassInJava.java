import demo1.MyTestClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestMyTestClassInJava {

	private MyTestClass _testObject;

	@BeforeEach
	public void setUp() {
		_testObject = new MyTestClass();
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
	public void assureThatDoSomethingReturnsParsedStringForHighParam2Values() {
		int returned = _testObject.doSomething("1234", 10);
		assertThat(returned, is(1234));
		returned = _testObject.doSomething("4567", Integer.MAX_VALUE);
		assertThat(returned, is(4567));
	}

	@Test
	public void assureThatDoSomethingThrowsExceptionForNonParseableString() {
		assertThrows(NumberFormatException.class, () -> 
		_testObject.doSomething("+-*~", 10));
	}
}
