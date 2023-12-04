import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

class PasswordValidationTest {
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

}