package modals;

import elements.Dropdown;
import elements.Input;
import elements.TextArea;
import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactsModal extends BaseModal{

    private final static By FIRSTNAME_INPUT = By.cssSelector("div.active a[title=New]");

    public NewContactsModal(WebDriver driver) {
        super(driver);
    }

    public void setFirstnameInputValue(String value) {
        driver.findElement(FIRSTNAME_INPUT).sendKeys(value);
    }


    public void fillForm(Contacts contacts) {

        new Input(driver, "First Name").setValue(contacts.getFirstName());
        new Input(driver, "Last Name").setValue(contacts.getLastName());
        new Input(driver, "Account Name").setValue(contacts.getLastName());
        new Input(driver, "Mobile").setValue(contacts.getLastName());
        new Input(driver,"Mailing Street").setValue(contacts.getMailingStreet());
        new Input(driver, "Mailing City").setValue(contacts.getMailingCity());
        new Input(driver,"Phone").setValue(contacts.getPhone());
        new Input(driver,"Email").setValue(contacts.getEmail());
        new Input(driver,"Title").setValue(contacts.getTitle());
        new Input(driver,"Mailing City").setValue(contacts.getMailingCity());
        new Input(driver,"Mailing StateProvince").setValue(contacts.getMailingStateProvince());
        new Input(driver,"Mailing ZipPostalCode").setValue(contacts.getMailingZipPostalCode());
        new Input(driver,"Mailing Country").setValue(contacts.getMailingCountry());
        new Input(driver,"Other City").setValue(contacts.getOtherCity());
        new Input(driver, "Other ZipPostalCode").setValue(contacts.getOtherZipPostalCode());
        new Input(driver, "Other StateProvince").setValue(contacts.getOtherStateProvince());
        new Input(driver, "Fax").setValue(contacts.getFax());
        new Input(driver, "Home phone").setValue(contacts.getHomePhone());
        new Input(driver, "Asst. phone").setValue(contacts.getAsstPhone());
        new Input(driver, "Assistant").setValue(contacts.getAssistant());
        new Input(driver, "Department").setValue(contacts.getDepartment());

        new TextArea(driver,"Description").setValue(contacts.getDescription());
        new Dropdown(driver, "Lead Source").setDropdownValue(contacts.getLeadSource().getName());
        new Dropdown(driver, "Salutation").setDropdownValue(contacts.getSalutation().getName());
    }

    @Override
    public void clickOnSaveButton() {
    }
}