package com.co.web.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target TITLE_MYACCOUNT = Target.the("Title myaccount").locatedBy("//a[@title = 'My Account']");
    public static final Target TITLE_LOGIN = Target.the("Title login").locatedBy("//a[text()= 'Login']");

    public static final Target FIELD_USERNAME = Target.the("Field Username").located(By.id("input-email"));
    public static final Target FIEL_PASSWORD = Target.the("Field password").located(By.id("input-password"));

    public static final Target BUTTON_LOGIN = Target.the("Button Login").locatedBy("//input[@value = 'Login']");

    public static final Target MESSAGE_PRODUCTS = Target.the("Message Products Success").locatedBy("//h2[text() = 'My Account']");

    public static final Target MESSAGE_PRODUCTS_ERROR = Target.the("Message Products Success").locatedBy("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");

}
