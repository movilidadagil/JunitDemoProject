package testdemo2;

import demo2.MathUtil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class Junit5_Instance_Test {

        MathUtil util;

        @BeforeAll
        static void beforeAllInit() {
            System.out.println("running before all");
        }

        @AfterAll
        static void afterAllCleanUp() {
            System.out.println("running after all");
        }

        @BeforeEach
        void init() {
            util = new MathUtil();
            System.out.println("running before each...");
        }

        @AfterEach
        void cleanUp() {
            System.out.println("running after each...");
        }

        @Test
        void testSum() {
            assertEquals(2, util.addWithInstance(1,1));
        }


}
