package com.wikipediaAutomation.pages;

import com.wikipediaAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WElem {

    public WElem () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ooui-php-1")
    public WebElement searchBox;

    @FindBy(className = "oo-ui-actionFieldLayout-button")
    public WebElement searchBtn;

    @FindBy (className = "mw-search-results")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//a[@aria-controls='mw-advancedSearch-expandable-options']")
    public WebElement advSearch;

    @FindBy(id = "ooui-41")
    public WebElement notTheseWordsBox;

    @FindBy(id = "ooui-49")
    public WebElement pageTitleContainsBox;

    @FindBy(id = "ooui-64")
    public WebElement fileTypeDD;

    @FindBy (xpath = "/html/body/div[6]/div[11]/div[5]")
    public WebElement videoChoice;

    @FindBy (id = "ooui-79")
    public WebElement sortingChoice;

    @FindBy (xpath = "/html/body/div[3]/div[3]/div[4]/div[2]/form/div[4]/div[1]/div/div/fieldset[4]/div/div/div/div/div/div/div/div[1]/span[3]")
    public WebElement relevanceChoice;

    @FindBy (xpath = "//a[@title='File:Roman Empire map.ogv']")
    public WebElement videoResult;
}
