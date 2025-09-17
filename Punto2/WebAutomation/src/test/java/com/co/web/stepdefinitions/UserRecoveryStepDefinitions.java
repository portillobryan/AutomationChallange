package com.co.web.stepdefinitions;

import com.co.web.models.UserLoginModel;
import com.co.web.models.UserRecoveryModel;
import com.co.web.questions.TheElement;
import com.co.web.task.Recovery;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static com.co.web.userinterfaces.RecoveryUI.MESSAGE_RECOVERY_ERROR;

public class UserRecoveryStepDefinitions {

    @DataTableType
    public UserRecoveryModel userRecoveryEntry(Map<String, String> entry) {
        return new UserRecoveryModel(
                entry.get("email")
        );
    }


    @When("the user fills the fields to recovery password with success")
    public void theUserFillsTheFieldsToRecoveryPassword(List<UserRecoveryModel> users) {
        OnStage.theActorInTheSpotlight().attemptsTo(Recovery.user(users.get(0)));
    }

    @Then("the user recovery success")
    public void theUserRecoverySuccess() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheElement.exists(MESSAGE_RECOVERY_ERROR))
        );
    }

}
