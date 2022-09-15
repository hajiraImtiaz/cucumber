package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types Steve Jobs in the wiki search box")
    public void userTypesSteveJobsInTheWikiSearchBox(String string) {

        wikiSearchPage.searchBox.sendKeys(string);
    }


    @And("User click wiki search button")
    public void userClickWikiSearchButton() {
       wikiSearchPage.searchBox.click();

    }

    @Then("User sees Steve Jobs is in wiki title")
    public void userSeesSteveJobsIsInWikiTitle(String string) {

        //verify actual title contains string (coming from feature file)
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {


    }
}
