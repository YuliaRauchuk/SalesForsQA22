package tests;

import io.qameta.allure.Lead;
import modals.BaseModal;
import models.Leads;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Integer.parseInt;


public class LeadsTest extends BaseTest {
  @BeforeMethod
    public void login() {
        loginPage.setUsername(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForUserAvatarIsDisplayed();
      Assert.assertTrue(homePage.isUserIconDisplayed());
    }
    @AfterMethod(alwaysRun = true)
  public void logout()    {
       homePage.logout();
       loginPage.waitLoginButtonIsDisplay();
    }

    @Test(dataProvider = "leadTestData")
    public void positiveLeadsTest(Leads lead) {

        homePage.openLeadsTab();
        leadsPage.clickNewButton();
        baseModal.waitSaveButtonIsDisplay();
        newLeadModal.fillForm(lead);
        newLeadModal.clickOnSaveButton();

        leadDetailsPage.waitMarkStatusAsCompleteButtonIsDisplay();
        Assert.assertEquals(leadDetailsPage.getLeadDetails(), lead);


        leadDetailsPage.clickMarkStatusAsCompleteButton();

        baseModal.waitGoToLeadButtonIsDisplay();
        baseModal.clickGoToLeadButton();
        contactsPage.waitUpdateTextInDisplay();
        homePage.openContactsTab();
        contactsPage.waitUpdateTextInDisplay();
        contactsPage.waitUpdateTextInDisplay();
        Assert.assertEquals(contactsPage.getContactPhone(), lead.getPhone());
    }

    private void waitMarkStatusAsCompleteButtonIsDisplay() {
    }

        @DataProvider(name="LeadData")
        public static Object[][] leadTestData() {
            return new Lead[][]{
                    {new Lead.LeadBuilder
                            ("Lev").setSalutation("Dr").setLastName("Lenin").setCompany("Leon").setPhone(String.valueOf("375336661199")
                                    .setLeadStatus("Working").setRating("Hot").setIndustry("Consulting").setleadSource("On Site").setEmail("leninl@yandex.ru")
                                    .setTitle("AaA").setStreet("Mira").setWebsite("www.blaLALA.com").setCity("Minsk").setStateProvince("EEE")
                                    .setZipPostalCode = parseInt("220011").setCountry("RB").setAnnualRevenue = parseInt("$1.200").setDescription("Work").build())};

    };
        }
}


