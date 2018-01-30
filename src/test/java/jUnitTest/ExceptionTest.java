package jUnitTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ExceptionTest {
    @Test(expected = ArithmeticException.class)
    public void testArithmeticException(){
        int i = 1/0;

        //
        /*
        * exceptiony maja miec bledne warunki np dzielenie przez 0
         */

    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundException(){
        List<String> listaStringow = new ArrayList<String>();
        assertTrue(listaStringow.get(0).equals("asdasdasd"));
    }


}
