package jUnitTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;

@DisplayName("== above class lalala ==")

public class JUpiterTest extends ConfigJupiter {

    @Nested
    @DisplayName("==== jupiter nested klas ===")

    public class JUpiterParametrized {


        int testowy = 20;
        String testowyString = "Ala ma kota";

        @Test
        @DisplayName("== to jest test jupitera ==")
        @RepeatedTest(5)


        public void jupiterTest() {
            System.out.println("jupiter");
            assertTrue(testowy == 20);
        }
    }

    @Nested
    @DisplayName("=== jupiter nested text====")
    public class nextNestedTest{

        @Test
        @DisplayName("===to jest test jupitera===")
        @RepeatedTest(5)
        public void jupiterNextTest2(){
            System.out.println("jupiter");
            assertTrue(5*4 == 20);
        }

    }

}
