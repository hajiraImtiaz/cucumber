package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wiki_StepDefinitions {

    @Given("User is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types Steve Jobs in the wiki search box")
    public void userTypesSteveJobsInTheWikiSearchBox() {

    }


    @And("User click wiki search button")
    public void userClickWikiSearchButton() {
    }

    @Then("User sees Steve Jobs is in wiki title")
    public void userSeesSteveJobsIsInWikiTitle() {
    }
}
