package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DashboardPage;

public class IsLoggedSuccessfully {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, DashboardPage.logoutButton);

    }
}
