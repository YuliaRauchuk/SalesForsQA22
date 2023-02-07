package tests;

import enums.Account.Type;
import enums.Industry;
import enums.LeadSource;
import enums.Salutation;
import models.Accounts;
import models.Contacts;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ContactsTest extends BaseTest {
    @BeforeMethod
    public void createContact() {
        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        homePage.openAccountsTab();
        accountDetailsPage.clickNewButton();
        newAccountsModal.waitSaveButtonIsDisplay();
      
