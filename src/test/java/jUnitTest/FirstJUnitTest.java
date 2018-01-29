package jUnitTest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstJUnitTest extends ConfigJUnit {

    @Before
    public void setUp(){
        System.out.println("================ @Before JUNIT tekst 1=============");
    }

//komentarz
    /*
    * to
    * jest
    * komentarz
     */


    public int testow = 2;
    public String testowy = "testowy";

    public int naszValue = 15;

    public String testowy2 = "to jest nasz tekst testowy";

    @Test
    public void firstTest(){
        assertTrue( "To jest test", testow == (1+1) );
        assertTrue(testowy.equals("testowy"));
        assertFalse(testowy.equals("test") );
        assertThat("To jest test na That",testowy, is("testowy"));
        assertTrue(naszValue == 15);

        assertThat(testowy2, containsString("tekst testowy"));
        assertThat(testowy2, endsWith("y"));
    }

    @Test
    public void secondTest(){
        Integer WartoscTestowa = null;
        assertNull(WartoscTestowa);
    }

}
