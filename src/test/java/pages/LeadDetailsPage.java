package pages;

import elements.RecordLogOutItem;
import enums.*;
import io.qameta.allure.Lead;
import models.Leads;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.Objects;

public class LeadDetailsPage extends HomePage {

    private final static By MARK_STATUS_AS_COMPLETE_BUTTON = By.xpath("//span[@class='uiOutputText']/ancestor::button");

    public Lead getLeadDetails()    {
        Lead.LeadBuilder lead = new Lead.LeadBuilder(
                new RecordLogOutItem(driver, "FirstName").getValue(),
                new RecordLogOutItem(driver, "LastName").getValue(),
                new RecordLogOutItem(driver, "Company").getValue()
                .setPhone(new RecordLogOutItem(driver, "Phone").getValue()
                .setStreet(new RecordLogOutItem(driver, "Street").getValue())
                .setCity(new RecordLogOutItem(driver, "City").getValue())
                .setStateProvince(new RecordLogOutItem(driver, "StateProvince")).getValue())
                .setLeadStatus(LeadStatus.fromString(new RecordLogOutItem(driver, "Lead Status").getValue()))
                .setSalutation(Objects.requireNonNull(Salutation.fromString(new RecordLogOutItem(driver, "Salutation").getValue()
                        .setEmail(new RecordLogOutItem(driver, "Email").getValue())
                        .setTitle(new RecordLogOutItem(driver, "Title").getValue())
                        .setWebsite(new RecordLogOutItem(driver, "Website").getValue())
                        .setPhone(new RecordLogOutItem(driver, "Phone").getValue())
                        .setAddress(new RecordLogOutItem(driver, "Address").getValue())
                        .setAnnualRevenue(new RecordLogOutItem(driver, "Annual Revenue").getValue())
                        .setDescription(new RecordLogOutItem(driver, "Description").getValue())
                        .setRating(Rating.fromString(new RecordLogOutItem(driver, "Rating").getValue()))
                        .setLeadSource(LeadSource.fromString(new RecordLogOutItem(driver, "Lead Source").getValue()))
                        .setIndustry(Industry.fromString(new RecordLogOutItem(driver, "Industry").getValue()))
                        .setCountry(new RecordLogOutItem(driver, "Country")).getValue())).build());
    }
    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }
    public void clickMarkStatusAsCompleteButton() {
        scrollIntoView(driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON));
        jsClick(driver.findElement(MARK_STATUS_AS_COMPLETE_BUTTON));
    }

    public void waitMarkStatusAsCompleteButtonIsDisplay()   {
        waitForElementDisplayed(MARK_STATUS_AS_COMPLETE_BUTTON);
    }
}