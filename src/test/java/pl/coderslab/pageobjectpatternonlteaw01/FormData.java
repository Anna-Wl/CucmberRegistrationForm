package pl.coderslab.pageobjectpatternonlteaw01;

import java.time.Month;

public class FormData {
    private boolean isMr;
    private String firstName;
    private String lastName;
    private String password;
    private int days;
    private Month months;
    private int years;
    private boolean isNewsletter;
    private boolean isSpecialOffers;

    public boolean isMr() {
        return isMr;
    }

    public FormData setMr(boolean mr) {
        isMr = mr;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public FormData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public FormData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FormData setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getDays() {
        return days;
    }

    public FormData setDays(int days) {
        this.days = days;
        return this;
    }

    public Month getMonths() {
        return months;
    }

    public FormData setMonths(Month months) {
        this.months = months;
        return this;
    }

    public int getYears() {
        return years;
    }

    public FormData setYears(int years) {
        this.years = years;
        return this;
    }

    public boolean isNewsletter() {
        return isNewsletter;
    }

    public FormData setNewsletter(boolean newsletter) {
        isNewsletter = newsletter;
        return this;
    }

    public boolean isSpecialOffers() {
        return isSpecialOffers;
    }

    public FormData setSpecialOffers(boolean specialOffers) {
        isSpecialOffers = specialOffers;
        return this;
    }
}
