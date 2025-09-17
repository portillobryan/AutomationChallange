package com.co.web.models;

public class UserRecoveryModel {

    private String email;

    public UserRecoveryModel(String email) {
        this.email = email;

    }

    public String getEmail() { return email; }
    public void setEmail(String username) { this.email = username; }

}
