package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.EnterText;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.DashboardPage;
import ui.HomePageUI;
import ui.LoginPage;
import ui.SignUpPage;

public class LogOut {
    public static void as(WebDriver driver, String email, String password){
        Click.on(driver, HomePageUI.loginButton);
        EnterText.text(driver, LoginPage.emailInput, email);
        EnterText.text(driver, LoginPage.passwordInput, password);
        Click.on(driver, LoginPage.loginButton);
        Click.on(driver, DashboardPage.logoutButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Log out user");
    }
}
