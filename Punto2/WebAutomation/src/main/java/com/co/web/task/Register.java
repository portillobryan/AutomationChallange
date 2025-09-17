package com.co.web.task;

import com.co.web.interactions.WaitFor;
import com.co.web.models.UserRegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.web.userinterfaces.RegisterUI.*;


public class Register implements Task {

    UserRegisterModel listuserRegisterModel;

    public Register(UserRegisterModel listuserRegisterModel) {
        this.listuserRegisterModel = listuserRegisterModel;
    }

    public static Register user(UserRegisterModel listuserRegisterModel){
        return Tasks.instrumented(Register.class, listuserRegisterModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(TITLE_MYACCOUNT));
        actor.attemptsTo(Click.on(TITLE_REGISTER));
        actor.attemptsTo(Enter.theValue(listuserRegisterModel.getFirstname()).into(FIELD_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(listuserRegisterModel.getLastname()).into(FIEL_LASTNAME));
        actor.attemptsTo(Enter.theValue(listuserRegisterModel.getEmail()).into(FIEL_EMAIL));
        actor.attemptsTo(Enter.theValue(listuserRegisterModel.getTelephone()).into(FIEL_TELEPHONE));
        actor.attemptsTo(Enter.theValue(listuserRegisterModel.getPassword()).into(FIEL_PASSWORD));
        actor.attemptsTo(Enter.theValue(listuserRegisterModel.getConfirm()).into(FIEL_PASSWORD_CONFIRM));
        actor.attemptsTo(Click.on(FIEL_AGREE));
        actor.attemptsTo(Click.on(INPUT_CONTINUE));
        actor.attemptsTo(WaitFor.seconds(1));
    }
}
