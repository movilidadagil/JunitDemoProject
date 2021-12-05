package testdemo2;

import demo2.MathUtil;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Junit5_Timeout_Annotation_Test {


	@BeforeAll
	@Timeout(4) // skips all tests if this method execution time exceeds 4 seconds
    static void setUpBeforeAllTests() throws Exception {
		TimeUnit.SECONDS.sleep(3);
		System.out.println("@BeforeAll");
    }
	
	@BeforeEach
	@Timeout(4) // fail all tests if this method execution time exceeds 4 seconds
    void setUp() throws Exception {
		TimeUnit.SECONDS.sleep(3);
		System.out.println("@BeforeEach");
    }
	
	
	@Test
	@Timeout(9) // this test fails if execution time exceeds 9 seconds
	void test_Add() throws Exception {
		
		TimeUnit.SECONDS.sleep(10); // waits 5 seconds
		System.out.println("test_Add()");
	}
	
	@Test
	@Timeout(9) // this test fails if execution time exceeds 9 seconds
	void test_Multiply() throws Exception {
		
		TimeUnit.SECONDS.sleep(8); // waits 3 seconds
		System.out.println("test_Multiply()");
	}
	
	@Test
	@Timeout(value = 900, unit = TimeUnit.MILLISECONDS)
	void test_isPrime() throws Exception {
		
		// fails if execution time exceeds 900 milli seconds
		TimeUnit.MILLISECONDS.sleep(1000);
		assertEquals(10, MathUtil.multiple(5, 2));
		System.out.println("test_isPrime()");
	}


}
