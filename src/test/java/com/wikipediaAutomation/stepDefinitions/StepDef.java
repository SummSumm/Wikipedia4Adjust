package com.wikipediaAutomation.stepDefinitions;

import com.wikipediaAutomation.pages.WElem;
import com.wikipediaAutomation.utilities.ConfigurationReader;
import com.wikipediaAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Locale;

public class StepDef {

  WElem webElements = new WElem();

    @Given("user is on search page")
    public void user_is_on_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user clicks on the search bar")
    public void user_clicks_on_the_search_bar() {
        webElements.searchBox.click();
    }

    @When("user writes the {string}")
    public void user_writes_the(String string) {
        webElements.searchBox.sendKeys(string);
    }

    @When("the user hits Search")
    public void the_user_hits_search() {
        webElements.searchBtn.click();
    }

    @Then("the search result is the {string} version for each")
    public void theSearchResultIsTheVersionForEach(String string) {
        String text = webElements.searchResults.get(0).getText();
        Assert.assertTrue(text.contains(string));
    }
    @Given("user writes kw1 in Search Box")
    public void user_writes_kw1_in_search_box() {
        webElements.searchBox.sendKeys(ConfigurationReader.getProperty("kw1"));
    }
    @When("user clicks on Advanced Search")
    public void user_clicks_on_advanced_search() {
        webElements.advSearch.click();
    }
    @When("user writes kw2 in the Not These Words Box under Search in Page Text")
    public void user_writes_kw2_in_the_not_these_words_box_under_search_in_page_text() {
        webElements.notTheseWordsBox.sendKeys(ConfigurationReader.getProperty("kw2"));
    }
    @When("user writes kw1 in Page Title Contains box under Structure")
    public void user_writes_kw1_in_page_title_contains_box_under_structure() {
        webElements.pageTitleContainsBox.sendKeys(ConfigurationReader.getProperty("kw1"));
    }
    @When("user chooses ch1 from File Type under Files and Images")
    public void user_chooses_ch1_from_file_type_under_files_and_images() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        webElements.fileTypeDD.click();
        Thread.sleep(3);
        webElements.videoChoice.click();
    }
    @When("user chooses ch2 from Sorting Order under Sorting Order")
    public void user_chooses_ch2_from_sorting_order_under_sorting_order() {
        webElements.sortingChoice.click();
        webElements.relevanceChoice.click();
    }
    @Then("user gets res1 in the results")
    public void user_gets_res1_in_the_results() {
        Assert.assertTrue(webElements.videoResult.isDisplayed());
    }
}
