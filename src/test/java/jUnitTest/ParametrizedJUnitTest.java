package jUnitTest;

import com.jsystems.PhoneValidator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.custom.combined.CombinedParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


@RunWith(JUnitParamsRunner.class)
public class ParametrizedJUnitTest {

    public PhoneValidator phoneValidator;

    @Test
    @Parameters({"1234567890", "123-456-7890", "123.456.7890", "123 456 7890", "123-456-7890 x1234", "123-456-7890 ext1234"})

    public void checkIfPhoneCorrect(String phoneNumber) {
        assertTrue(phoneValidator.validatePhoneNumber(phoneNumber));

    }

    @Test
    @Parameters({"1234567890-x", "123-456-7890-x", "123.456.7890-x", "123 456 7890-x", "123-456-7890-x1234", "123-456-7890-ext1234"})

    public void checkIfPhoneInCorrect(String phoneNumber) {
        assertFalse(phoneValidator.validatePhoneNumber(phoneNumber));
    }

    @Test
    @Parameters({"lll@de.de", "sdf.sdf@.sdf"})

    public void checkIfEmailValid(String email) {
        assertTrue(phoneValidator.isValidEmail(email));
    }


    @Test
    @CombinedParameters({"1,3", "2,4"})
        public void combinedParam(String first, String second){

            String results = first + second;
            System.out.println(results);
            assertTrue(results.contains("1")  || results.contains("3") );
            assertTrue(results.contains("2")  || results.contains("4") );
        }


}
