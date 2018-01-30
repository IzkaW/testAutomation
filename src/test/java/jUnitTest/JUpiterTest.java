package jUnitTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;

@DisplayName("== above class lalala ==")

public class JUpiterTest extends ConfigJupiter{

    int testowy = 20;
    String testowyString = "Ala ma kota";

    @Test
    @DisplayName("== to jest test jupitera ==")
    @RepeatedTest(5)


    public void jupiterTest(){
        System.out.println("jupiter");
        assertTrue(testowy == 20);
    }
}
