package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.DashboardPage;

public class IsProjectAdded {

    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, DashboardPage.noItemsLabel);
    }
    /*public static String getTextSuccess(WebDriver webDriver) throws InterruptedException {

        WebDriverWait waitLimit = new WebDriverWait(webDriver, 5);
        WebElement element = waitLimit.until(ExpectedConditions.presenceOfElementLocated(DashboardPage.projectName));
        Thread.sleep(3000);
        return element.getText();
    }*/
}
