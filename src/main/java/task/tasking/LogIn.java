package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.EnterText;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginPage;
import ui.SignUpPage;

public class LogIn {
    public static void as(WebDriver driver, String email, String password){
        Click.on(driver, HomePageUI.loginButton);
        EnterText.text(driver, LoginPage.emailInput, email);
        EnterText.text(driver, LoginPage.passwordInput, password);
        Click.on(driver, LoginPage.loginButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Log in user");
    }
}
