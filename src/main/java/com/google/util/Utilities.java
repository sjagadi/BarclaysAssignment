package com.google.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//This class contains reusable methods
public class Utilities extends BaseTest
{
    //Get the page title
    public static String getPageTitle()
    {
        return driver.getTitle();
    }
    //Get the text from the element using WebElement
    public static String getText(WebElement element)
    {
        return element.getText();
    }
    //Enter text into textbox
    public static void enterText(WebElement textbox, String textToSearch)
    {
        textbox.clear();
        textbox.sendKeys(textToSearch);
    }
}