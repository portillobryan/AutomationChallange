package com.co.web.task;

import com.co.web.interactions.WaitFor;
import com.co.web.models.UserLoginModel;
import com.co.web.models.UserRecoveryModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.web.userinterfaces.RecoveryUI.*;


public class Recovery implements Task {

    UserRecoveryModel listUserRecoveryModel;

    public Recovery(UserRecoveryModel listUserRecoveryModel) {
        this.listUserRecoveryModel = listUserRecoveryModel;
    }

    public static Recovery user(UserRecoveryModel listUserRecoveryModel){
        return Tasks.instrumented(Recovery.class, listUserRecoveryModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(TITLE_MYACCOUNT));
        actor.attemptsTo(Click.on(TITLE_LOGIN));
        actor.attemptsTo(Click.on(TITLE_PASSWORD));
        actor.attemptsTo(Enter.theValue(listUserRecoveryModel.getEmail()).into(FIELD_EMAIL));
        actor.attemptsTo(Click.on(BUTTON_CONTINUE));
        actor.attemptsTo(WaitFor.seconds(1));
    }
}
