package ui;

import org.openqa.selenium.By;

public class LoginPage {
    public static By emailInput = By.xpath("//div[@id='HPloginDiv']/div[1]/input[1]");
    public static By passwordInput = By.xpath("//div[@id='HPloginDiv']//input[2]");
    public static By loginButton = By.xpath("//div[@id='HPloginDiv']/div[1]//input[@class='HPLoginBtn']");

}
