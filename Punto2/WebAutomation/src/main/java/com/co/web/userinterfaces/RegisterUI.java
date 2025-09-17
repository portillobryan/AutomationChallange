package com.co.web.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUI {

    public static final Target TITLE_MYACCOUNT = Target.the("Title myaccount").locatedBy("//a[@title = 'My Account']");
    public static final Target TITLE_REGISTER = Target.the("Title login").locatedBy("//a[text()= 'Register']");


    public static final Target FIELD_FIRSTNAME = Target.the("Field Username").located(By.id("input-firstname"));
    public static final Target FIEL_LASTNAME = Target.the("Field password").located(By.id("input-lastname"));
    public static final Target FIEL_EMAIL = Target.the("Field password").located(By.id("input-email"));
    public static final Target FIEL_TELEPHONE = Target.the("Field password").located(By.id("input-telephone"));
    public static final Target FIEL_PASSWORD = Target.the("Field password").located(By.id("input-password"));
    public static final Target FIEL_PASSWORD_CONFIRM = Target.the("Field password").located(By.id("input-confirm"));
    public static final Target FIEL_AGREE = Target.the("Field password").locatedBy("//input[@name='agree']");

    public static final Target INPUT_CONTINUE = Target.the("Field password").locatedBy("//input[@value='Continue']");

    public static final Target MESSAGE_ACCOUNT = Target.the("Message Account").locatedBy("//h1[text()='Account']");


}
