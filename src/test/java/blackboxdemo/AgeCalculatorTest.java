package blackboxdemo;

import demo1.MyTestClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class AgeCalculatorTest {


    MyTestClass myTestClass = new MyTestClass();
    @Test
    @Tag("BVA approach: age should be in range(30,100)")
    @ValueSource(ints = {30})
    void test_age_correctly(int age){

        int expectedAge = myTestClass.calculateAge("05-12-1991");
        Assertions.assertEquals(expectedAge,age);

    }
    @Test
    @Tag("BVA approach: age should be in range(30,100)")
    @ValueSource(ints = {31})
    void test_age_correctly_1(int age){

        int expectedAge = myTestClass.calculateAge("05-12-1990");
        Assertions.assertEquals(expectedAge,age);

    }
    @Test
    @Tag("BVA approach: age should be in range(30,100)")
    @ValueSource(ints = {65})
    void test_age_correctly_2(int age){

        int expectedAge = myTestClass.calculateAge("05-12-1991");
        Assertions.assertEquals(expectedAge,age);

    }
    @Test
    @Tag("BVA approach: age should be in range(30,100)")
    @ValueSource(ints = {99})
    void test_age_correctly_3(int age){

        int expectedAge = myTestClass.calculateAge("05-12-1991");
        Assertions.assertEquals(expectedAge,age);

    }

    @Test
    @Tag("BVA approach: age should be in range(30,100)")
    @ValueSource(ints = {100})
    void test_age_correctly_4(int age){

        int expectedAge = myTestClass.calculateAge("05-12-1991");
        Assertions.assertEquals(expectedAge,age);

    }

}
