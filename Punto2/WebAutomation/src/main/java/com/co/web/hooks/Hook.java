package com.co.web.hooks;

import com.co.web.drivers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hook extends Driver {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("actor");
    }

    @After
    public void afterHook() {
        // Si tienes tareas de cierre, las agregas aquí.
        // Ejemplo: theActorInTheSpotlight().attemptsTo(LogOut.theSession());
    }
}
