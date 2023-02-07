package modals;


import elements.TextArea;
import models.Accounts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import elements.Input;

    public class NewAccountsModal extends BaseModal {
        private final static By FIRSTNAME_INPUT = By.cssSelector("div.active a[title=New]");

        public NewAccountsModal(WebDriver driver) {
            super(driver);
        }

        @Override
        public void clickOnSaveButton() {

        }
        public void setFirstnameInputValue(String value) {

            driver.findElement(FIRSTNAME_INPUT).sendKeys(value);
        }

        public void fillForm(Accounts accounts) {
            new Input(driver, "Account Name").setValue(accounts.getAccountName());
            new Input(driver, "Phone").setValue(accounts.getPhone());
            new Input(driver,"Fax").setValue(accounts.getFax());
            new Input(driver,"Parent Account").setValue(accounts.getParentAccount());
            new Input(driver,"Website").setValue(accounts.getWebsite());
            new Input(driver,"BillingStateProvince").setValue(accounts.getBillingStateProvince());
            new Input(driver,"BillingZipPostalCode").setValue(accounts.getBillingZipPostalCode());
            new Input(driver,"BillingCountry").setValue(accounts.getBillingCountry());
            new Input(driver,"BillingStreet").setValue(accounts.getBillingStreet());
            new Input(driver,"AnnualRevenue").setValue(accounts.getAnnualRevenue());
            new TextArea(driver,"Description").setValue(accounts.getDescription());
            new TextArea(driver,"ShoppingStreet").setValue(accounts.getShoppingStreet());
            new Input(driver,"ShoppingCity").setValue(accounts.getShoppingCity());
            new Input(driver,"ShoppingZipPostalCode").setValue(accounts.getShoppingZipPostalCode());
            new Input(driver,"ShoppingStateProvince").setValue(accounts.getShoppingStateProvince());
            new Input(driver,"ShoppingZipPostalCode").setValue(accounts.getShoppingZipPostalCode());
            new Input(driver,"ShoppingCountry").setValue(accounts.getShoppingCountry());

        }
    }
