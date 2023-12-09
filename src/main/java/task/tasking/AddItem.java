package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.EnterText;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.DashboardPage;
import ui.HomePageUI;
import ui.LoginPage;

public class AddItem {
    public static void as(WebDriver driver, String email, String password, String projectName, String itemName){
        Click.on(driver, HomePageUI.loginButton);
        EnterText.text(driver, LoginPage.emailInput, email);
        EnterText.text(driver, LoginPage.passwordInput, password);
        Click.on(driver, LoginPage.loginButton);
        Click.on(driver, DashboardPage.addProjectButton);
        EnterText.text(driver, DashboardPage.addProjectInput, projectName);
        Click.on(driver, DashboardPage.addProjectButtonCommit);

        EnterText.text(driver, DashboardPage.newItemInput, itemName);
        Click.on(driver, DashboardPage.addNewItemButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Add project");
    }
}
