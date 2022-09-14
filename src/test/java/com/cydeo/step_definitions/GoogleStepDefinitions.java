package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword);
    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        //junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("title is not as expected!",expectedTitle, actualTitle);

    }

    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {
    googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        //junit assertion accepts first arg as expected, second arg as actual
        Assert.assertEquals("title is not as expected!",expectedTitle, actualTitle);
        //Assert.assertTrue(actualTitle.equals(expectedTitle));

    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
       // System.out.println("User is on google search page");
        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
      //  System.out.println("User is seeing title is Google");
        String expecedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expecedTitle);

        Driver.closeDriver();



    }
}
