package pl.coderslab.pageobjectpatternonlteaw01;

import java.time.Month;

public class FormDataUserAddress {
    private String company;
    private String address;
    private String zip;
    private String city;
    private String phone;
    private String additionaInformation;

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdditionaInformation() {
        return additionaInformation;
    }


    public FormDataUserAddress setCompany(String company) {
        this.company = company;
        return this;
    }

    public FormDataUserAddress setAddress(String address) {
        this.address = address;
        return this;
    }

    public FormDataUserAddress setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public FormDataUserAddress setCity(String city) {
        this.city = city;
        return this;
    }

    public FormDataUserAddress setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public FormDataUserAddress setAdditionaInformation(String additionaInformation) {
        this.additionaInformation = additionaInformation;
        return this;
    }
}
