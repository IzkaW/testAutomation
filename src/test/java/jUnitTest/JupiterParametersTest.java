package jUnitTest;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class JupiterParametersTest {
    @DisplayName("=== jupiter parameters ====")
    @ParameterizedTest
    @CsvSource({"Hello, 5", "JUnit 5, 7", "'Hello, JUnit 5', 15"})
    public void shouldArrayCompare(String tekst, Integer integer){
        List<String> listaStringow = Arrays.asList("Hello", "JUnit 5", "Hello, JUnit 5");
        List<Integer> listaIntegerow = Arrays.asList(5,7,15);

        assertTrue(listaStringow.contains(tekst));
        assertTrue(listaIntegerow.contains(integer));
    }




}
