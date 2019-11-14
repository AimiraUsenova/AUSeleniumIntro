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


public class BuyFunctionality {

    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void buyFunct() throws InterruptedException {

        driver.get("https://www.zillow.com");

        WebElement buyButton = driver.findElement(By.xpath("//a[@href='/homes/']"));
        Actions act = new Actions(driver);
        act.moveToElement(buyButton).perform();
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/homes/for_sale/']")).isDisplayed());

    }


    @Test
    public void HomesForSale() throws InterruptedException {

        driver.get("https://www.zillow.com");

        WebElement buyButton = driver.findElement(By.xpath("//a[@href='/homes/']"));
        Actions act = new Actions(driver);
        act.moveToElement(buyButton).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/homes/for_sale/']")).click(); //homes for sale
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class='save-search-button zsg-button']")).isDisplayed());
    }


    @Test
    public void ComingSoon() throws InterruptedException {

        driver.get("https://www.zillow.com");

        WebElement buyButton = driver.findElement(By.xpath("//a[@href='/homes/']"));
        Actions act = new Actions(driver);
        act.moveToElement(buyButton).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@title='Coming soon']")).click();   //coming soon
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='price']")).isDisplayed());

    }

    @Test
    public void NewConstraction() throws InterruptedException {

        driver.get("https://www.zillow.com");

        WebElement buyButton = driver.findElement(By.xpath("//a[@href='/homes/']"));
        Actions act = new Actions(driver);
        act.moveToElement(buyButton).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@title='New construction']")).click();   //new construction field
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='beds']")).isDisplayed());

    }

    @Test
    public void astana() throws InterruptedException {

        driver.get("https://www.zillow.com");

        driver.findElement(By.xpath("//a[@href='/homes/']")).click();
        Actions act = new Actions(driver);
        //act.moveToElement(buyButton).perform();
        Thread.sleep(2000);

        WebElement search=driver.findElement(By.xpath("//input[@class='react-autosuggest__input']"));
        search.click();
        act.keyDown(Keys.COMMAND).perform();
        act.sendKeys("a").perform();
        act.sendKeys(Keys.DELETE).perform();
        act.keyUp(Keys.COMMAND).perform();
        Thread.sleep(1000);

       search.sendKeys("                ASTANA"); //for search button
        //input[@class='react-autosuggest__input'] ==search button




    }
}
