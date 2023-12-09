package ui;

import org.openqa.selenium.By;

public class DashboardPage {
    public static By logoutButton = By.xpath("//a[.='Logout']");
    public static By addProjectButton = By.xpath("//td[.='Add New Project']");
    public static By addProjectInput = By.xpath("//input[@id='NewProjNameInput']");
    public static By addProjectButtonCommit = By.xpath("//input[@id='NewProjNameButton']");
    public static By noItemsLabel = By.xpath("//div[@class='NoItems']");
    public static By newItemInput = By.xpath("//textarea[@id='NewItemContentInput']");
    public static By addNewItemButton = By.xpath("//input[@id='NewItemAddButton']");
    public static By newItemLabel = By.className("ItemContentDiv");

}
