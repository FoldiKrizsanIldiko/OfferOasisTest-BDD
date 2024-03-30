package com.codecool.the_recruitables.offer_oasis_tests;

import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinitions {

    WebDriver chromedriver= new ChromeDriver();
    @Given("I am on registration page")
    public void iAmOnRegistrationPage() {
    }

    @When("I type valid {string}, {string} and {string} to form")
    public void iTypeValidAndToForm(String arg0, String arg1, String arg2) {
    }

    @And("I click the box to accept Terms and Conditions")
    public void iClickTheBoxToAcceptTermsAndConditions() {
    }

    @Then("my registration is confirmed")
    public void myRegistrationIsConfirmed() {
    }

    @And("I can login with {string} and {string}")
    public void iCanLoginWithAnd(String arg0, String arg1) {
    }

    @When("I type {}, {} and {} to form")
    public void iTypeAndToForm(String arg0, String arg1, String arg2) {
    }

    @Then("I got warning to fill out all fields")
    public void iGotWarningToFillOutAllFields() {
    }
    @After("@register")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            Utils.makeScreenshot(chromedriver, "addProduct");
        }
        chromedriver.quit();
    }
}
