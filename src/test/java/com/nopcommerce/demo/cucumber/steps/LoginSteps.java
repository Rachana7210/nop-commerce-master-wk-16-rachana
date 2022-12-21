package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Text is not Display","Welcome, Please Sign In!",new LoginPage().getWelcomeText());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I enter on login button$")
    public void iEnterOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should be see logout link is display$")
    public void iShouldBeSeeLogoutLinkIsDisplay(String errorMessage) {
        Assert.assertEquals("Log out link is display",errorMessage,new LoginPage().getErrorMessage());
    }

    @Then("^I should see the error message\"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage)  {
        Assert.assertEquals("Message not displayed",errorMessage,new LoginPage().getErrorMessage());
    }

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I enter valid email \"([^\"]*)\"$")
    public void iEnterValidEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see login link is display$")
    public void iShouldSeeLoginLinkIsDisplay(String errorMessage) {
      Assert.assertEquals("log in link is display",errorMessage,new LoginPage().getErrorMessage());
    }

}


