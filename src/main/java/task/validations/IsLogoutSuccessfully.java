package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DashboardPage;
import ui.HomePageUI;

public class IsLogoutSuccessfully {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUI.landingTitle);
    }
}
