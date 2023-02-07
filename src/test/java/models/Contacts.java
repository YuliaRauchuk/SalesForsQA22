package models;

import enums.*;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder(setterPrefix = "set")
public class Contacts {
    private final String firstName;
    private final String lastName;
    private final String accountName;
    private final String phone;
    private final String mobile;
    private final Salutation salutation;
    private final LeadSource leadSource;
    private final String email;
    private final String title;
    private final String reportsTo;
    private final String mailingStreet;
    private final String mailingCity;
    private final String mailingStateProvince;
    private final String otherCity;
    private final String otherStreet;
    private final String otherZipPostalCode;
    private final String otherCountry;
    private final String otherStateProvince;
    private final String mailingZipPostalCode;
    private final String mailingCountry;
    private final String fax;
    private final String homePhone;
    private final String otherPhone;
    private final String asstPhone;
    private final String assistant;
    private final String department;
    private final String birthdate;
    private final String description;


    public Contacts (ContactsBuilder contactsBuilder) {

        this.firstName = contactsBuilder.firstName;
        this.lastName = contactsBuilder.lastName;
        this.accountName = contactsBuilder.accountName;
        this.phone = contactsBuilder.phone;
        this.mobile = contactsBuilder.mobile;
        this.salutation = contactsBuilder.salutation;
        this.leadSource = contactsBuilder.leadSource;
        this.email = contactsBuilder.email;
        this.title = contactsBuilder.title;
        this.reportsTo = contactsBuilder.reportsTo;
        this.mailingStreet = contactsBuilder.mailingStreet;
        this.mailingCity = contactsBuilder.mailingCity;
        this.mailingStateProvince = contactsBuilder.mailingStateProvince;
        this.otherCity = contactsBuilder.otherCity;
        this.otherStreet = contactsBuilder.otherStreet;
        this.otherZipPostalCode = contactsBuilder.otherZipPostalCode;
        this.otherCountry = contactsBuilder.otherCountry;
        this.otherStateProvince = contactsBuilder.otherStateProvince;
        this.mailingZipPostalCode =contactsBuilder.mailingZipPostalCode;
        this.mailingCountry = contactsBuilder.mailingCountry;
        this.fax = contactsBuilder.fax;
        this.homePhone = contactsBuilder.homePhone;
        this.otherPhone = contactsBuilder.otherPhone;
        this.asstPhone = contactsBuilder.asstPhone;
        this.assistant = contactsBuilder.assistant;
        this.department = contactsBuilder.department;
        this.birthdate = contactsBuilder.birthdate;
        this.description = contactsBuilder.description;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public String getOtherStateProvince() {
        return otherStateProvince;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public String getFax() {
        return fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public String getDepartment() {
        return department;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountName'" + accountName + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", salutation=" + salutation +
                ", leadSource='" + leadSource + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", reportsTo='" + reportsTo + '\'' +
                ", mailingStreet='" + mailingStreet + '\'' +
                ", mailingCity='" + mailingCity + '\'' +
                ", mailingStateProvince='" + mailingStateProvince + '\'' +
                ", otherCity='" + otherCity + '\'' +
                ", otherStreet='" + otherStreet + '\'' +
                ", otherZipPostalCode='" + otherZipPostalCode + '\'' +
                ", otherCountry='" + otherCountry + '\'' +
                ", otherStateProvince='" + otherStateProvince + '\'' +
                ", mailingCountry='" + mailingCountry + '\'' +
                ", fax='" + fax + '\'' +
                ", description='" + description + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", otherPhone='" + otherPhone + '\'' +
                ", assistant='" + assistant + '\'' +
                ", department='" + department + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, accountName, phone, mobile, email, salutation, leadSource, title, reportsTo, mailingStreet, mailingCity, mailingStateProvince, mailingCountry, otherCity, otherStreet, otherZipPostalCode, otherCountry, otherStateProvince, fax, description, homePhone, otherPhone, assistant, department, birthdate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return Objects.equals(firstName, contacts.firstName)
                && Objects.equals(lastName, contacts.lastName)
                && Objects.equals(accountName, contacts.accountName)
                && Objects.equals(phone, contacts.phone)
                && Objects.equals(mobile, contacts.mobile)
                && Objects.equals(salutation, contacts.salutation)
                && Objects.equals(leadSource, contacts.leadSource)
                && Objects.equals(email, contacts.email)
                && Objects.equals(title, contacts.title)
                && Objects.equals(reportsTo, contacts.reportsTo)
                && Objects.equals(mailingStreet, contacts.mailingStreet)
                && Objects.equals(mailingCity, contacts.mailingCity)
                && Objects.equals(mailingStateProvince, contacts.mailingStateProvince)
                && Objects.equals(otherCity, contacts.otherCity)
                && Objects.equals(otherStreet, contacts.otherStreet)
                && Objects.equals(otherZipPostalCode, contacts.otherZipPostalCode)
                && Objects.equals(otherCountry, contacts.otherCountry)
                && Objects.equals(otherStateProvince, contacts.otherStateProvince)
                && Objects.equals(mailingCountry, contacts.mailingCountry)
                && Objects.equals(fax, contacts.fax)
                && Objects.equals(description, contacts.description)
                && Objects.equals(homePhone, contacts.homePhone)
                && Objects.equals(otherPhone, contacts.otherPhone)
                && Objects.equals(assistant, contacts.assistant)
                && Objects.equals(department, contacts.department)
                && Objects.equals(birthdate, contacts.birthdate);
    }
}