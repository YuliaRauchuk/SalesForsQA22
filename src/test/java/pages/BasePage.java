package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebElement element;

    public  BasePage(WebDriver driver) {
        this.driver = driver;

        this.wait = new WebDriverWait(driver, 30);
        }
        protected void waitForElementDisplayed(By elementLocator) {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementLocator));
        }
        protected void jsClick() {
            ((JavascriptExecutor) driver).executeScript("argument[0].click();", element);
    }

    protected void scrollIntoView(WebElement element)  {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}