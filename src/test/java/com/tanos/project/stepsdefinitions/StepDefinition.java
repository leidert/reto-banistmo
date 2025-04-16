package com.tanos.project.stepsdefinitions;

import com.tanos.project.interactions.Cambio;
import com.tanos.project.interactions.Wait;
import com.tanos.project.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinition {

    @Given("go in the web site to banistmo and go to click on de cockies button")
    public void goInTheWebSiteToBanistmoandGoToClickOnDeKockiesButton() {
        theActorInTheSpotlight().attemptsTo(ClickButtonCookiesTask.clickButtonCookies());
    }
    @When("we click on the button Aprender es facil")
    public void weClickOnTheButtonAprenderEsFacil() {

        theActorInTheSpotlight().attemptsTo(ClickButtonAprenderTask.clickButtonAprender());
    }
    @When("we click on the button conocer mas in legales")
    public void weClickOnTheButtonConocerMasInLegales() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(ClickButtonLegalesTask.clickButtonLegales());
    }
    @When("we click on the button conocer mas in the FATCA")
    public void weClickOnTheButtonConocerMasInTheFATCA() {

        theActorInTheSpotlight().attemptsTo(ClickButtonFatcaTask.clickButtonFatca());
    }
    @When("click on the pdf download")
    public void clickOnThePdfDownload() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(ClickButtDownloadTask.clickButtDownload());
    }
    @When("pdf validate")
    public void pdfValidate(){
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(2),
                Wait.seconds(300),
                Cambio.aLaPestana(1));
    }
}
