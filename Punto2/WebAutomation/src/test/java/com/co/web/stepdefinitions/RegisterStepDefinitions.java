package com.co.web.stepdefinitions;

import com.co.web.drivers.Driver;
import com.co.web.models.UserLoginModel;
import com.co.web.models.UserRegisterModel;
import com.co.web.questions.TheElement;
import com.co.web.task.Login;
import com.co.web.task.Register;
import com.co.web.utils.constants.General;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static com.co.web.userinterfaces.RegisterUI.MESSAGE_ACCOUNT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitions {

    @DataTableType
    public UserRegisterModel userRegisterEntry(Map<String, String> entry) {
        return new UserRegisterModel(
                entry.get("firstname"),
                entry.get("lastname"),
                entry.get("email"),
                entry.get("telephone"),
                entry.get("password"),
                entry.get("confirm")
        );
    }

    @When("the user fills the fields to register with success")
    public void theUserFillsTheFieldsToRegisterWithSuccess(List<UserRegisterModel> users) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.user(users.get(0)));
    }


    @Then("the register successfully")
    public void theRegisterSuccessfully() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheElement.exists(MESSAGE_ACCOUNT))
        );
    }

}
