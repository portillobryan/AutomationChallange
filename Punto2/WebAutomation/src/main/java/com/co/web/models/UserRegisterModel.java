package com.co.web.models;

public class UserRegisterModel {

    private String firstname;
    private String lastname;
    private String email;
    private String telephone;
    private String password;
    private String confirm;

    public UserRegisterModel(String firstname, String lastname, String email, String telephone, String password, String confirm) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.confirm = confirm;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirm() {
        return confirm;
    }
}
