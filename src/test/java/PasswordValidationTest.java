import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

public class PasswordValidationTest {
    @Test
    public void lengthCheckTest_when0Till7_thenReturnFalse() {
        //GIVEN
        String password = "a5nh";
        //WHEN
        boolean actual = PasswordValidation.lengthCheck(password);
        //THEN
        assertFalse(actual, "Passwort soll mindestens 8 Zeichen lang sein");

    }
    @Test
    public void lengthCheckTest2_when8orMore_thenReturnTrue() {
        //GIVEN
        String password = "abnh9gjhf";
        //WHEN
        boolean actual = PasswordValidation.lengthCheck(password);
        //THEN
        assertTrue(actual);

    }
    @Test
    public void numbersCheckTest_whenNumbers_thenReturnTrue() {
        //GIVEN
        String password = "nhj4df4jlf";
        //WHEN
        boolean actual = PasswordValidation.numbersCheck(password);
        //THEN
        assertTrue(actual);

    }
    @Test
    public void numbersCheckTest_whenNoNumbers_thenReturnFalse() {
        //GIVEN
        String password = "nhjadfjlf";
        //WHEN
        boolean actual = PasswordValidation.numbersCheck(password);
        //THEN
        assertFalse(actual);

    }
    @Test
    public void upperCaseCheck_whenLowAndUp_thenReturnTrue(){
        //GIVEN
        String password = "nHadJfjNlf";
        //WHEN
        boolean actual = PasswordValidation.upperCaseCheck(password);
        //THEN
        assertTrue(actual);

    }
    @Test
    public void upperCaseCheck_whenNoLowAndUp_thenReturnFalse(){
        //GIVEN
        String password = "nkadkjblf";
        //WHEN
        boolean actual = PasswordValidation.upperCaseCheck(password);
        //THEN
        assertFalse(actual);

    }
    @Test
    public void lowerCaseCheck_whenLowAndUp_thenReturnTrue(){
        //GIVEN
        String password = "nHadJfjNlf";
        //WHEN
        boolean actual = PasswordValidation.lowerCaseCheck(password);
        //THEN
        assertTrue(actual);

    }
    @Test
    public void lowerCaseCheck_whenNoLowAndUp_thenReturnFalse(){
        //GIVEN
        String password = "DHKUZREBMP";
        //WHEN
        boolean actual = PasswordValidation.lowerCaseCheck(password);
        //THEN
        assertFalse(actual);

    }@Test
    public void specialCharactersCheck_whenNoSpecialCharacters_thenReturnFalse(){
        //GIVEN
        String password = "Password1";
        //WHEN
        boolean actual = PasswordValidation.specialCharactersCheck(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    public void specialCharactersCheck_whenSpecialCharacters_thenReturnTrue(){
        //GIVEN
        String password = "Password1./";
        //WHEN
        boolean actual = PasswordValidation.specialCharactersCheck(password);
        //THEN
        assertTrue(actual);
    }

}