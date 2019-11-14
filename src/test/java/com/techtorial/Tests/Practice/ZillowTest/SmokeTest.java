package com.techtorial.Tests.Practice.ZillowTest;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SmokeTest {
    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }
    @Test
    public void goToZillowWebsite() {
        driver.get("https://www.zillow.com/");
        Assert.assertEquals("https://www.zillow.com/", driver.getCurrentUrl());
    }
    @Test
    public void hoverOverBuyOption() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/homes/']"))).perform();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//h6[.='Homes for Sale']")).isDisplayed());
    }
    @Test
    public void searchCity() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.click();
        search.sendKeys("Chicago");
        driver.findElement(By.id("search-icon")).click();
        Thread.sleep(1000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='sc-14dvu6m-4 fHnlHd ']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='search-title']")).isDisplayed());
    }
    @Test
    public void goToHelpPage() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        driver.findElement(By.xpath("//a[@href='https://zillow.zendesk.com/hc/en-us/']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Help"));
    }
}