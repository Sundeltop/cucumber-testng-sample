package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleStep {

    @Given("User opens {string}")
    public void user_opens_url(String URL) {
        open(URL);
    }

    @When("User searches for {string}")
    public void user_searchers_for(String searchInput) {
        $("[name='q']")
                .setValue(searchInput)
                .pressEnter();
    }

    @Then("First search result is {string}")
    public void first_search_result_is(String expectedSearchResult) {
        $("#search .yuRUbf h3")
                .shouldHave(text(expectedSearchResult));
    }
}
