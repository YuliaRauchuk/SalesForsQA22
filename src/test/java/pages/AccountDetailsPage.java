package pages;

import elements.RecordLogOutItem;
import enums.Account.Type;
import enums.Industry;
import models.Accounts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class AccountDetailsPage extends EntityBasePage   {

        private final static By ADD_BUTTON = By.xpath("//span[text()='Add']");

        public Accounts getAccountDetails()  {
            Accounts.AccountsBuilder account = Accounts.builder()
                    .setAccountName(new  RecordLogOutItem(driver, "Account Name").getValue())
                    .setPhone(new RecordLogOutItem(driver, "Phone").getValue())
                    .setFax(new RecordLogOutItem(driver, "Fax").getValue())
                    .setWebsite(new RecordLogOutItem (driver, "Website").getValue())
                    .setType(Type.fromString(new RecordLogOutItem(driver, "Type").getValue()))
                    .setIndustry(Industry.fromString(new RecordLogOutItem(driver, "Industry").getValue()))

                    .setAnnualRevenue(new RecordLogOutItem(driver, "Annual Revenue").getValue())
                    .setDescription(new RecordLogOutItem(driver, "Description").getValue())
                    .setBillingAddress(new RecordLogOutItem(driver, "Billing Address").getValue())
                    .setShoppingAddress(new RecordLogOutItem(driver, "Shopping Address").getValue());
            return account.build();
        }

        public void waitAddButtonIsDisplay()    {
            waitForElementDisplayed(ADD_BUTTON);
        }

        public AccountDetailsPage(WebDriver driver) {
            super(driver);
        }

        @Override
        public void waitLoginButtonIsDisplay() {

        }
    }
