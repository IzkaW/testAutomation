package jUnitTest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ConfigJupiter {
    @BeforeEach
    public void setUp() {
        System.out.println("================ @BeforeEatch Jupiter tekst =============");
    }

    @BeforeAll
    public static void init() {
        System.out.println("================ @BeforeAll Jupiter tekst =============");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("================ @AfterEach Jupiter tekst =============");
    }

    @AfterAll()
        public static void closeAll(){
            System.out.println("================ @AfterAll Jupiter tekst =============");
        }


}
