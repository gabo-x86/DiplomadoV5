import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddProject;
import task.tasking.LogIn;
import task.validations.IsLoggedSuccessfully;
import task.validations.IsProjectAdded;

public class AddProjectTest extends BaseTest {
    @Test
    public void addProjectSuccessTest(){
        AddProject.as(webDriver, "gabriel.hurtado@test.com","SuperSecretPassword!", "Diplomado V5");
        Assert.assertTrue(IsProjectAdded.visible(webDriver));
    }
}
