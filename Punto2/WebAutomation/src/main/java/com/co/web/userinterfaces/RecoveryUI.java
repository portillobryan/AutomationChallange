package com.co.web.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecoveryUI {

    public static final Target TITLE_MYACCOUNT = Target.the("Title myaccount").locatedBy("//a[@title = 'My Account']");
    public static final Target TITLE_LOGIN = Target.the("Title login").locatedBy("//a[text()= 'Login']");
    public static final Target TITLE_PASSWORD = Target.the("Title login").locatedBy("//a[text()= 'Forgotten Password']");
    public static final Target FIELD_EMAIL = Target.the("Field Username").located(By.id("input-email"));
    public static final Target BUTTON_CONTINUE = Target.the("Button Continue").locatedBy("//input[@value = 'Continue']");

    public static final Target MESSAGE_RECOVERY_ERROR = Target.the("Message Products Success").locatedBy("//div[text()=' An email with a confirmation link has been sent your email address.']");


}
