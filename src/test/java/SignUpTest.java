import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUp;
import task.validations.IsLoggedSuccessfully;

public class SignUpTest extends BaseTest {
    @Test
    public void signUpSuccessTest(){
        //The email should be different for every test
        SignUp.as(webDriver, "Gabriel Hurtado Cossio", "gabriel.hurtado@test.com","SuperSecretPassword!");
        Assert.assertTrue(IsLoggedSuccessfully.visible(webDriver));
    }
}
