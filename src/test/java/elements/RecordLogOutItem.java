package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RecordLogOutItem extends BaseElement {
    private final static String ELEMENTS_DETAILS_LOCATOR ="//*[contains(@class, 'slds-show')]//span[text()='%s']" +
            "/ancestor::records-record-layout-item//*[@data-output-element-id='output-field";

    public RecordLogOutItem(WebDriver driver, String label)
    {super(driver, label); this.label =label;}

    public String getValue() {
        WebElement characteristic =driver.findElement(By.xpath(String.format(ELEMENTS_DETAILS_LOCATOR, this.label)));
        scrollIntoView(characteristic);
        return characteristic.getText();
}
}
