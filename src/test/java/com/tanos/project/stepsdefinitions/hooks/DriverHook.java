package com.tanos.project.stepsdefinitions.hooks;

import com.tanos.project.utils.WebDriverFactory;
import io.cucumber.java.BeforeAll;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class DriverHook {

    @BeforeAll
    public static void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb("https://www.banistmo.com/wps/portal/banistmo/personas"))));
        OnStage.theActorCalled("Automation");
    }
}
