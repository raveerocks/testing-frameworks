package io.raveerocks.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition {

    @Given("^User is on landing page$")
    public void userIsOnLandingPage() {
        System.out.println("User is on landing page...");
    }

    @When("^User login into application with username and password$")
    public void userLoginIntoApplicationWithUsernameAndPassword()  {
        System.out.println("User login into application with username and password...");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    @When("User login into application with parameters (.+) and (.+)$")
    public void userLoginIntoApplicationWithUsernameAndPassword(String userName, String password) {
        System.out.println("User login into application with "+userName+" and "+password+"...");
    }


    @Then("^Home page is populated$")
    public void homePageIsPopulated() {
        System.out.println("Home page is populated...");
    }

    @And("^Cards are displayed$")
    public void cardsAreDisplayed() {
        System.out.println("Cards are displayed...");
    }


    @And("^Cards are not displayed$")
    public void cardsAreNotDisplayed() {
        System.out.println("Cards are not displayed...");
    }


}