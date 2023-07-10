package net.onlinenotepad.stepdefinitions;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.onlinenotepad.task.OpenBrowserTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CreateNoteOnlineStepDefinition {


    @Managed
    public WebDriver webdriver;
    private Actor prueba =Actor.named("prueba");
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        prueba.whoCan(BrowseTheWeb.with(webdriver));
    }

    @Given("I am on the note creation page")
    public void iAmOnTheNoteCreationPage() {prueba.attemptsTo(OpenBrowserTask.openBrowser());

    }
    @When("I enter the  {string}")
    public void iEnterThe(String string) {

    }
    @Then("I see the saved note with the text highlighted in bold")
    public void iSeeTheSavedNoteWithTheTextHighlightedInBold() {

    }

}
