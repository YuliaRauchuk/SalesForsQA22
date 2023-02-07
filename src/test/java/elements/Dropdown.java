package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement {

    private final static String DROPDOWN_LOCATOR ="//label[text()='%$s']/following-sibling::div/lightning-base-combobox";
    private final static String BUTTON_LOCATOR ="//label[text()='%$s']/following-sibling::div/lightning-base-combobox//button";
    private final static String OPTION_LOCATOR = "//label[text()='%$s']/following-sibling::div/lightning-base-combobox-item[text()='%s']";
    private final static String OPEN_DROPDOWN_LOCATOR = "//lightning-base-combobox[@class='slds-combobox_container']/span[text() = '%s']";
    public Dropdown(WebDriver driver, String label) {
        super(driver,label);
    }
    public void setDropdownValue(String optionName) {
        WebElement dropdown = driver.findElement(By.xpath(String.format(DROPDOWN_LOCATOR, this.label)));
        scrollIntoView(dropdown);
        dropdown.findElement(By.xpath(BUTTON_LOCATOR)).click();
        dropdown.findElement(By.xpath(String.format(OPEN_DROPDOWN_LOCATOR, optionName)));
}
}
