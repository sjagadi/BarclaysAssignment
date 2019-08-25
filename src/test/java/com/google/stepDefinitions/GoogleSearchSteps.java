package com.google.stepDefinitions;

import com.google.pages.GooglePage;
import com.google.util.BaseTest;
import com.google.util.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GoogleSearchSteps extends BaseTest
{
    GooglePage googlePage;
//    @Given("Barclays employee open google search page")
//    public void barclays_employee_open_google_search_page()
//    {
//
//
//        googlePage = new GooglePage();
//    }
//
//    @When("search for {string} keyword")
//    public void search_for_keyword(String keyword)
//    {
//        googlePage.searchText("barclays");
//    }
//
//    @Then("the first result on the page shows {string}")
//    public void the_first_result_on_the_page_shows(String expectedBarclaysUrl)
//    {
//
//    }


    @Given("I have {string} browser opened")
    public void iHaveBrowserOpened(String browser)
    {
        initialization(browser);
        googlePage = new GooglePage();
    }

    @When("I go to {string}")
    public void iGoTo(String goToUrl)
    {
        driver.get(goToUrl);
        Assert.assertEquals("Google", Utilities.getPageTitle());
    }

    @And("I type {string} into search bar")
    public void iTypeIntoSearchBar(String keywordToSearch)
    {
        googlePage.searchText(keywordToSearch);
    }

    @And("I hit search")
    public void iHitSearch()
    {
        googlePage.clickSearchButton();
    }

    @Then("{string} is first url on search results page")
    public void isFirstUrlOnSearchResultsPage(String expectedBarclaysUrl)
    {
        String barclaysUrl = googlePage.searchBarclaysUrl();
        Assert.assertEquals(barclaysUrl, expectedBarclaysUrl);
        closeBrowser();
    }
}
