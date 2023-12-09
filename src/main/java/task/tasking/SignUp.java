package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.EnterText;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.SignUpPage;

public class SignUp {
    public static void as(WebDriver driver, String fullName, String email, String password){
        Click.on(driver, HomePageUI.signupButton);
        EnterText.text(driver, SignUpPage.fullNameInput, fullName);
        EnterText.text(driver, SignUpPage.emailInput, email);
        EnterText.text(driver, SignUpPage.passwordInput, password);
        Click.on(driver, SignUpPage.agreementBox);
        Click.on(driver, SignUpPage.signupButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Signup user");
    }
}
