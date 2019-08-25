package com.google.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest
{
    public static WebDriver driver = null;

    public BaseTest()
    {
        try
        {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/google/config/config.properties");
        }
        catch (IOException e)
        {
            e.getMessage();
        }
    }

    public static void initialization(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/exe/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            //Firefox implementation
        }
        else if(browser.equalsIgnoreCase("ie"))
        {
            //IE implementation
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void closeBrowser()
    {
        driver.quit();
    }
}
