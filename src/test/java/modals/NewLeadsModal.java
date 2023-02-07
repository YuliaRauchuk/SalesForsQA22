package modals;

import elements.TextArea;
import models.Leads;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import elements.Dropdown;
import elements.Input;

public class NewLeadsModal extends BaseModal {
 private final static By FIRSTNAME_INPUT = By.cssSelector("div.active a[title=New]");

 public NewLeadsModal(WebDriver driver) {
  super(driver);
 }
 public void setFirstNameInputValue(String value) {driver.findElement(FIRSTNAME_INPUT).sendKeys(value);
 }
public void fillForm(Leads lead) {
 new Input(driver, "First Name").setValue(lead.getFirstName());
 new Input(driver, "Last Name").setValue(lead.getLastName());
 new Input(driver,"Company").setValue(lead.getCompany());
 new Input(driver,"Phone").setValue(lead.getPhone());
 new Input(driver,"Email").setValue(lead.getEmail());
 new Input(driver,"Title").setValue(lead.getTitle());
 new Input(driver,"Website").setValue(lead.getWebsite());
 new Input(driver,"City").setValue(lead.getCity());
 new Input(driver,"StateProvince").setValue(lead.getStateProvince());
 new Input(driver,"ZipPostalCode").setValue(lead.getZipPostalCode());
 new Input(driver,"Country").setValue(lead.getCountry());
 new Input(driver,"AnnualRevenue").setValue(lead.getAnnualRevenue());

 new TextArea(driver,"Description").setValue(lead.getDescription());
 new TextArea(driver, "Street").setValue(lead.getStreet());

 new Dropdown(driver, "Lead Status").setDropdownValue(lead.getLeadStatus().getName());
 new Dropdown(driver, "Rating").setDropdownValue(lead.getRating().getName());
 new Dropdown(driver, "Lead Source").setDropdownValue(lead.getLeadSource().getName());
 new Dropdown(driver, "Industry").setDropdownValue(lead.getIndustry().getName());
 new Dropdown(driver, "Salutation").setDropdownValue(lead.getSalutation().getName());
}
 @Override
 public void clickOnSaveButton() {
 }
}
