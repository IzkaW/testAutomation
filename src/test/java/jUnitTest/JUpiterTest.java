package jUnitTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

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
        @RepeatedTest(2)
        public void jupiterNextTest2(){
            System.out.println("jupiter2");
            assertTrue(5*4 == 20);
        }

        @ParameterizedTest
        @DisplayName("Test z CSV")
        @CsvFileSource(resources = "/plik.csv")
        public void csvTest(String name, Integer age){
            assertTrue(name instanceof String);
            assertTrue(age instanceof Integer);
        }

        @ParameterizedTest
        @ValueSource(ints = {1,2,3,4})
        public void withValueSourceTest(int value){
            assertTrue(value < 100);
        }
    }

}
