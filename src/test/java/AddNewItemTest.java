import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddItem;
import task.tasking.AddProject;
import task.validations.IsItemAdded;
import task.validations.IsLoggedSuccessfully;

public class AddNewItemTest extends BaseTest {
    @Test
    public void addProjectSuccessTest(){
        AddItem.as(webDriver, "gabriel.hurtado@test.com","SuperSecretPassword!", "Diplomado V5", "New Item");
        Assert.assertTrue(IsItemAdded.visible(webDriver));
    }

}
