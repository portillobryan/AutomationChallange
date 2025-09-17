package com.co.web.stepdefinitions;

import com.co.web.drivers.Driver;
import com.co.web.models.UserLoginModel;
import com.co.web.questions.TheElement;
import com.co.web.task.Login;
import com.co.web.utils.constants.General;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static com.co.web.userinterfaces.LoginUI.MESSAGE_PRODUCTS;
import static com.co.web.userinterfaces.LoginUI.MESSAGE_PRODUCTS_ERROR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserLoginStepDefinitions {

    @DataTableType
    public UserLoginModel userLoginEntry(Map<String, String> entry) {
        return new UserLoginModel(
                entry.get("username"),
                entry.get("password")
        );
    }

    @Given("the user enter main page")
    public void theUserEnterMainPage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.inThePage(General.URL)));
    }

    @When("the user fills the fields to login with password incorrect")
    public void theUserFillsTheFieldsToLoginWithpasswordIncorrect(List<UserLoginModel> users) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.user(users.get(0)));
    }

    @When("the user fills the fields to login with success")
    public void theUserFillsTheFieldsToLoginWithSuccess(List<UserLoginModel> users) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.user(users.get(0)));
    }

    @Then("the user successfully login")
    public void theUserSuccessfullyLogin() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheElement.exists(MESSAGE_PRODUCTS))
        );
    }

    @Then("the system show message error")
    public void theSystemShowMessageError() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(TheElement.exists(MESSAGE_PRODUCTS_ERROR))
        );
    }
}
