package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class EntityBasePage extends HomePage {
    public EntityBasePage(WebDriver driver) {
        super(driver);
    }

    private final static By NEW_BUTTON = By.xpath("div.active a[title=New]");
    private final static By LEADS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Leads']");
    private final static By ACCOUNTS_MENU_TAB_LOCATOR = By.xpath("//one-app-nav-bar//a[@title='Accounts']");

    public void clickNewButton()    {
        driver.findElement(NEW_BUTTON).click();
    }
    public void waitForPageLoaded() {
    waitForElementdisplayed(NEW_BUTTON);
}

    private void waitForElementdisplayed(By newButton) {
    }
    protected void waitForElementClicable(By newButton) {
    }
    public void clickLeadsMenuTabLocator()
    {driver.findElement(LEADS_MENU_TAB_LOCATOR).click();}

    public void clickAccountMenuTabLocator()
    {driver.findElement(ACCOUNTS_MENU_TAB_LOCATOR).click();}

}