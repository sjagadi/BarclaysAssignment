package com.google.pages;
import com.google.util.BaseTest;
import com.google.util.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BaseTest
{
    @FindBy(name = "q")
    WebElement searchTextBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(xpath = "(//div[@class='TbwUpd'])[1]")
    WebElement barclaysUrlHolder;

    public GooglePage()
    {
        PageFactory.initElements(driver, this);
    }

    public void searchText(String textToSearch)
    {
        Utilities.enterText(searchTextBox, textToSearch);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }
    public String searchBarclaysUrl()
    {
        String barclaysUrl = Utilities.getText(barclaysUrlHolder);
        return barclaysUrl;
    }
}
