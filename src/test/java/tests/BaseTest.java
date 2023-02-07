package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.NewLeadsModal;
import modals.BaseModal;
import modals.NewContactsModal;
import modals.NewAccountsModal;
import modals.NewLeadsModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;
public abstract class BaseTest {
    protected final static String BASE_URL = "https://www.salesforce.com/";
    protected final static String USERNAME = "rauchukyulia-zwaj@force.com";
    protected final static String PASSWORD = "1320523QA22";


    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadDetailsPage leadDetailsPage;
    protected NewLeadsModal newLeadModal;
    protected BaseModal baseModal;
    protected ContactsPage contactsPage;
    protected AccountDetailsPage accountDetailsPage;
    protected EntityBasePage entityBasePage;
    protected NewAccountsModal newAccountsModal;
//    protected ContactDetailsPage contactDetailsPage;
    protected NewContactsModal newContactsModal;
@BeforeClass(alwaysRun = true)
public void setUp(ITestContext testContext) {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    options.addArguments("-- ignore-certificate-errors");
    options.addArguments("--disable-popup-blocking");
    options.addArguments("--disable-notifications");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    testContext.setAttribute("driver", driver);

    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    leadsPage = new LeadsPage(driver);
    leadDetailsPage = new LeadDetailsPage(driver);
    newLeadModal = new NewLeadsModal(driver);
    baseModal = new BaseModal(driver) {
        @Override
        public void clickOnSaveButton() {

        }
    };
    contactsPage = new ContactsPage(driver)s
    accountDetailsPage = new AccountDetailsPage(driver);
    entityBasePage = new EntityBasePage(driver);
    newAccountsModal = new NewAccountsModal(driver);
    newContactsModal = new NewContactsModal(driver);

}
    @BeforeMethod(alwaysRun = true)
public void navigate() {
    driver.get(BASE_URL);}

    @AfterClass(alwaysRun = true)
public void tearDown() {
    driver.quit();
}
}