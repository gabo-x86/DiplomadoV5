import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LogOut;
import task.tasking.SignUp;
import task.validations.IsLoggedSuccessfully;
import task.validations.IsLogoutSuccessfully;

public class LogoutTest extends BaseTest {
    @Test
    public void logoutSuccessTest(){
        LogOut.as(webDriver, "gabriel.hurtado@test.com","SuperSecretPassword!");
        Assert.assertTrue(IsLogoutSuccessfully.visible(webDriver));
    }
}
