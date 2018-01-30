package jUnitTest;

import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

public class JupiterParametersTest {
    @DisplayName("=== jupiter parameters ====")
    public void shouldArrayCompare(){
        List<String> listaStringow = Arrays.asList("Hello", "JUnit 5", "Hello, JUNIT 5");
        List<Integer> listaIntegerow = Arrays.asList(5,7,15);

    }

}
