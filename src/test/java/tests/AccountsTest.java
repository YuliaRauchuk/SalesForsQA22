package tests;

import models.Accounts;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest{
    @Test
    public void positiveAccountsTest() {

        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
        Assert.assertTrue(homePage.isUserIconDisplayed());

        homePage.openAccountsTab();
        accountDetailsPage.clickNewButton();
        newAccountsModal.waitSaveButtonIsDisplay();

       
