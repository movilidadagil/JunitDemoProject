package testdemo2;

import demo2.MathUtil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5_Instance_Test_Second {


        MathUtil   util = new MathUtil() ;

        @BeforeAll
        public static void beforeAllInit() {
            System.out.println("running before all");
        }

        @AfterAll
        public static void afterAllCleanUp() {
            System.out.println("running after all");
        }

        @BeforeEach
        void init() {
            System.out.println("running before each...");

        }

        @AfterEach
        void cleanUp() {
            System.out.println("running after each...");
        }

        @Test
        void testSum() {
            assertEquals(2, util.addWithInstance(1, 1));
        }

    @Test
    void testSumSec() {
        assertEquals(2, util.addWithInstance(3, 1));
    }



}
