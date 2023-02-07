package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class BaseModal extends BasePage {
    public BaseModal(WebDriver driver) {
        super(driver);
    }

    private final static By SAVE_BUTTON = By.cssSelector("//button[@class='slds-button slds-button_brand']");
    private final static By SAVE_AND_NEW_BUTTON = By.cssSelector("//button[@name='SaveAndNew']");
    private final static By CANCEL_BUTTON = By.cssSelector("//button[@name='CancelEdit']");
    private final static By GO_TO_LEAD_BUTTON = By.xpath("//button[text()='Go to Leads']");

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickSaveAndNewButton() {
        driver.findElement(SAVE_AND_NEW_BUTTON).click();
    }

    public void clickCancelButton() {
        driver.findElement(CANCEL_BUTTON).click();
    }


    public void clickGoToLeadButton()   {
        driver.findElement(GO_TO_LEAD_BUTTON).click();
    }

    public void waitGoToLeadButtonIsDisplay()   {
        waitForElementDisplayed(GO_TO_LEAD_BUTTON);
    }

    public void waitSaveButtonIsDisplay() {
        waitForElementDisplayed(SAVE_BUTTON);
    }

    public void waitConvertButtonIsDisplay()    {
        waitForElementDisplayed(CANCEL_BUTTON);
    }

    public abstract void clickOnSaveButton();
}


