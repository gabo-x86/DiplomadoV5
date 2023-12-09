import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LogIn;
import task.tasking.SignUp;
import task.validations.IsLoggedSuccessfully;

public class LogInTest extends BaseTest {
    @Test
    public void loginSuccessTest(){
        LogIn.as(webDriver, "gabriel.hurtado@test.com","SuperSecretPassword!");
        Assert.assertTrue(IsLoggedSuccessfully.visible(webDriver));
    }
}
