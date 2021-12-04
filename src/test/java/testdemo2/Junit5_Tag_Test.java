package testdemo2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags(value = 
 {@Tag("regression"),
  @Tag("user_module")
 })
public class Junit5_Tag_Test {
	
	@Tag("acceptance")
	@Test
	void acceptance_test1() {
		System.out.println("acceptance_test1()");
	}
	
	@Tag("acceptance")
	@Test
	void acceptance_test2() {
		System.out.println("acceptance_test2()");
	}

	@Tag("accessability")
	@Test
	void accessability_test1() {
		System.out.println("accessability_test1()");
	}
	
	@Tag("security")
	@Test
	void security_test1() {
		System.out.println("security_test1()");
	}
	
	@Tag("api")
	@Test
	void api_test1() {
		System.out.println("api_test1()");
	}
	
	@Tag("api")
	@Test
	void api_test2() {
		System.out.println("api_test2()");
	}
	
	@Tag("load")
	@Test
	void load_test1() {
		System.out.println("load_test1()");
	}
	
	@Tag("performance")
	@Test
	void performance_test1() {
		System.out.println("performance_test1()");
	}
}
