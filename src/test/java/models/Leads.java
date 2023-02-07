package models;

import java.util.Objects;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder(setterPrefix ="set")
@Getter
public class Leads {

    private String firstName;
    private String lastName;
    private String company;
    private String phone;
    private String leadStatus;
    private String salutation;
    private String rating;
    private String industry;
    private String leadSource;
    private String email;
    private String title;
    private String street;
    private String website;
    private String city;
    private String stateProvince;
    private String zipPostalCode;
    private String country;
    private String annualRevenue;
    private String description;

    private Leads(LeadsBuilder leadsBuilder) {

        this.firstName = leadsBuilder.firstName;
        this.lastName = leadsBuilder.lastName;
        this.company = leadsBuilder.company;
        this.phone = leadsBuilder.phone;
        this.leadStatus= leadsBuilder.leadStatus;
        this.salutation = leadsBuilder.salutation;
        this.rating = leadsBuilder.rating;
        this.industry = leadsBuilder.industry;
        this.leadSource = leadsBuilder.leadSource;
        this.email = leadsBuilder.email;
        this.title = leadsBuilder.title;
        this.website = leadsBuilder.website;
        this.city = leadsBuilder.city;
        this.stateProvince = leadsBuilder.stateProvince;
        this.zipPostalCode = leadsBuilder.zipPostalCode;
        this.country = leadsBuilder.country;
        this.annualRevenue = leadsBuilder.annualRevenue;
        this.description = leadsBuilder.description;


    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCompany() {
        return company;
    }
    public String getPhone() {
        return phone;
    }

    public String getLeadStatus()  {
        return leadStatus;
    }

    public String getSalutation()   {
        return this.salutation;
    }

    public String getRating() {
        return this.rating;
    }
    public String getEmail() {
        return email;
    }
    public String getTitle() {
        return title;
    }
    public String getWebsite() {
        return website;
    }
    public String getCity() {
        return city;
    }
    public String getStateProvince() {
        return stateProvince;
    }
    public String getZipPostalCode() {
        return zipPostalCode;
    }
    public String getCountry() {
        return country;
    }
    public String getAnnualRevenue() {
        return annualRevenue;
    }
    public String getDescription() {
        return description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leads leads = (Leads) o;
        return Objects.equals(firstName, leads.firstName)
                && Objects.equals(lastName, leads.lastName)
                && Objects.equals(company, leads.company)
                && Objects.equals(phone, leads.phone)
                && Objects.equals(leadStatus, leads.leadStatus)
                && Objects.equals(salutation, leads.salutation)
                && Objects.equals(rating, leads.rating)
                && Objects.equals(industry, leads.industry)
                && Objects.equals(leadSource, leads.leadSource)
                && Objects.equals(email, leads)
                && Objects.equals(title, leads.title)
                && Objects.equals(street, leads.street)
                && Objects.equals(website, leads.website)
                && Objects.equals(city, leads.city)
                && Objects.equals(stateProvince, leads.stateProvince)
                && Objects.equals(zipPostalCode, leads.zipPostalCode)
                && Objects.equals(country, leads.country)
                && Objects.equals(annualRevenue, leads.annualRevenue)
                && Objects.equals(description, leads.description);
    }
        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, company, phone, email, title, leadStatus, salutation, rating, industry, leadSource, street, website, city, stateProvince, zipPostalCode, country, annualRevenue, description);

        }

    @Override
    public String toString() {
        return "Leads{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", leadStatus='" + leadStatus + '\'' +
                ", salutation='" + salutation + '\'' +
                ", rating='" + rating + '\'' +
                ", industry='" + industry + '\'' +
                ", leadSource='" + leadSource + '\'' +
                ", street='" + street + '\'' +
                ", website='" + website + '\'' +
                ", city='" + city + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", zipPostalCode='" + zipPostalCode + '\'' +
                ", country='" + country + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


