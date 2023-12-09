package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.DashboardPage;

public class IsItemAdded {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, DashboardPage.newItemLabel);
    }
}
