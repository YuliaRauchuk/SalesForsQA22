package elements;

import elements.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TextArea extends BaseElement{

    private final static String TEXTAREA_LOCATOR = "//span[text()='%s']//ancestor:://div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea']//textarea";
    public TextArea(WebDriver driver, String label) {
        super(driver, label);

    }
    public void setValue(String value) {
        WebElement textArea = driver.findElement(By.xpath(String.format(TEXTAREA_LOCATOR, this.label)));
        scrollIntoView(textArea);
        textArea.sendKeys(value);
    }
}
