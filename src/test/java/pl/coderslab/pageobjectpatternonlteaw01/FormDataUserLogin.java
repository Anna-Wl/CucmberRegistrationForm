package pl.coderslab.pageobjectpatternonlteaw01;

public class FormDataUserLogin {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public FormDataUserLogin setName(String name) {
        this.name = name;
        return this;
    }

    public FormDataUserLogin setSurname(String surname) {
        this.surname = surname;
        return this;
    }

}
