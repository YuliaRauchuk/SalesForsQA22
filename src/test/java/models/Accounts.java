package models;

import lombok.Builder;
import lombok.Data;
import java.util.Objects;
@Data
@Builder(setterPrefix = "set")

public class Accounts {
    private String accountName;
    private String parentAccount;
    private String fax;
    private String phone;
    private String employees;
    private String website;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingStateProvince;
    private String billingZipPostalCode;
    private String billingCountry;
    private String shoppingStreet;
    private String shoppingCity;
    private String shoppingZipPostalCode;
    private String shoppingStateProvince;
    private String shoppingCountry;
    private String industry;
    private String type;
    private String billingAddress;
    private String shoppingAddress;

    public Accounts(AccountsBuilder accountsBuilder) {
        this.accountName = accountsBuilder.accountName;
        this.parentAccount = accountsBuilder.parentAccount;
        this.fax = accountsBuilder.fax;
        this.phone = accountsBuilder.phone;
        this.employees = accountsBuilder.employees;
        this.website = accountsBuilder. website;
        this.annualRevenue = accountsBuilder. annualRevenue;
        this.description = accountsBuilder.description;
        this.billingStreet = accountsBuilder.billingStreet;
        this.billingCity = accountsBuilder.billingCity;
        this.billingStateProvince = accountsBuilder.billingStateProvince;
        this.billingZipPostalCode = accountsBuilder.billingZipPostalCode;
        this.billingCountry = accountsBuilder. billingCountry;
        this.shoppingStreet = accountsBuilder.shoppingStreet;
        this.shoppingCity = accountsBuilder.shoppingCity;
        this.shoppingZipPostalCode = accountsBuilder. shoppingZipPostalCode;
        this.shoppingStateProvince = accountsBuilder.shoppingStateProvince;
        this.shoppingCountry = accountsBuilder.shoppingCountry;
        this.industry = accountsBuilder.industry;
        this.type = accountsBuilder.type;
        this.billingAddress = accountsBuilder.billingAddress;
        this.shoppingAddress = accountsBuilder.shoppingAddress;
    }


    public String getAccountName() {return accountName;
    }
    public void setAccountsName(String accountsName) {
        this.accountName = accountName;
    }
    public String getParentAccount() {
        return parentAccount;
    }
    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmployees() {
        return employees;
    }
    public void setEmployees(String employees) {
        this.employees = employees;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getAnnualRevenue() {
        return annualRevenue;
    }
    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getBillingStreet() {
        return billingStreet;
    }
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }
    public String getBillingCity() {
        return billingCity;
    }
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }
    public String getBillingStateProvince() {
        return billingStateProvince;
    }
    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;}
    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }
    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;}
    public String getBillingCountry() {
        return billingCountry;
    }
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;}
    public String getShoppingStreet() {
        return shoppingStreet;}
    public void setShoppingStreet(String shoppingStreet) {
        this.shoppingStreet = shoppingStreet;}
    public String getShoppingCity() {
        return shoppingCity;}
    public void setShoppingCity(String shoppingCity) {
        this.shoppingCity = shoppingCity;}
    public String getShoppingZipPostalCode() {
        return shoppingZipPostalCode;}
    public void setShoppingZipPostalCode(String shoppingZipPostalCode) {
        this.shoppingZipPostalCode = shoppingZipPostalCode;}
    public String getShoppingStateProvince() {
        return shoppingStateProvince;}
    public void setShoppingStateProvince(String shoppingStateProvince) {
        this.shoppingStateProvince = shoppingStateProvince;}
    public String getShoppingCountry() {
        return shoppingCountry;}
    public void setShoppingCountry(String shoppingCountry) {
        this.shoppingCountry = shoppingCountry;}
    public String getIndustry() {
        return industry;}
    public void setIndustry(String industry) {
        this.industry = industry;}
    public void setType(String type) {
        this.type = type;}
    public String getType() {
        return type; }
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;}
    public String getBillingAddress() {
        return billingAddress;}
    public void setShoppingAddress(String shoppingAddress) {
        this.shoppingAddress = shoppingAddress;}
    public String getShoppingAddress() {
        return shoppingAddress;}

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", parentAccount='" + parentAccount + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", website='" + website + '\'' +
                ", billingStreet='" + billingStreet + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingStateProvince='" + billingStateProvince + '\'' +
                ", billingZipPostalCode='" + billingZipPostalCode + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", shoppingStreet='" + shoppingStreet + '\'' +
                ", shoppingCity='" + shoppingCity + '\'' +
                ", employees='" + employees + '\'' +
                ", description='" + description + '\'' +
                ", industry=" + industry +
                ", type=" + type +
                ", billingAddress='" + billingAddress + '\'' +
                ", shoppingAddress='" + shoppingAddress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, parentAccount, fax, phone, employees, website, annualRevenue, description, billingStreet, billingCity, billingStateProvince, billingZipPostalCode, billingCountry, shoppingStreet, shoppingCity, shoppingZipPostalCode, shoppingStateProvince, shoppingCountry, industry, type, billingAddress, shoppingAddress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounts accounts = (Accounts) o;
        return Objects.equals(accountName, accounts.accountName)
                && Objects.equals(parentAccount, accounts.parentAccount)
                && Objects.equals(phone, accounts.phone)
                && Objects.equals(fax, accounts.fax)
                && Objects.equals(website, accounts.website)
                && Objects.equals(employees, accounts.employees)
                && Objects.equals(annualRevenue, accounts.annualRevenue)
                && Objects.equals(description, accounts.description)
                && Objects.equals(industry, accounts.industry)
                && Objects.equals(billingStreet, accounts.billingStreet)
                && Objects.equals(billingCity, accounts.billingCity)
                && Objects.equals(billingStateProvince, accounts.billingStateProvince)
                && Objects.equals(billingZipPostalCode, accounts.billingZipPostalCode)
                && Objects.equals(billingCountry, accounts.billingCountry)
                && Objects.equals(shoppingStreet, accounts.shoppingStreet)
                && Objects.equals(shoppingCity, accounts.shoppingCity)
                && Objects.equals(shoppingZipPostalCode, accounts.shoppingZipPostalCode)
                && Objects.equals(shoppingStateProvince, accounts.shoppingStateProvince)
                && Objects.equals(shoppingCountry, accounts.shoppingCountry)
                && Objects.equals(type, accounts.type)
                && Objects.equals(billingAddress, accounts.billingAddress)
                && Objects.equals(shoppingAddress, accounts.shoppingAddress);

    }
}


