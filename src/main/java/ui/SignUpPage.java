package ui;

import org.openqa.selenium.By;

public class SignUpPage {
    public static By fullNameInput = By.xpath("//div[@class='HPsignupDiv']/input[1]");
    public static By emailInput = By.xpath("//div[@class='HPsignupDiv']/input[2]");
    public static By passwordInput = By.xpath("//div[@class='HPsignupDiv']/input[3]");
    public static By agreementBox = By.xpath("//label[@class='HPLoginTerms']/input[1]");
    public static By signupButton = By.xpath("//div[@class='HPsignupDiv']//input[@class='HPLoginBtn']");

}
