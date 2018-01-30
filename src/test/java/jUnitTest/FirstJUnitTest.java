package jUnitTest;

import com.jsystems.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasSize;
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

    List<Integer> integery = Arrays.asList(1,2,3,4,5,6);
    List<Integer> integery2 = Arrays.asList(1,2,3,4,5,6);

    @Test
    public void thirdTest() {

        assertThat(integery, hasItems(5));
        assertThat(integery, hasSize(6));
        assertArrayEquals(integery.toArray(), integery2.toArray());

    }

    String ala = "ala";
    String beta2 = "ala";
    String ala2 = new String("ala");
    String beta = "ala2";

    @Test
    public void fourthTest(){
        assertTrue(ala == beta2);
       // assertTrue((ala == ala2));
       // assertTrue(ala.equals(ala2));
        assertTrue(beta.equals(ala2));

    }

    User naszUser = new User();
    @Test
    public void piatyTest(){
        assertTrue(naszUser.countAge(20) == 120);
        assertFalse(naszUser.countAge(20) == 90);
    }

}
