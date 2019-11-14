package com.techtorial.Tests.Practice.ZillowTest;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.List;
import java.util.Set;
public class RentFunctionality {
    WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }
    @Test
    public void hoverOverRentTab() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement rentTab = driver.findElement(By.xpath("(//a[@href='/homes/for_rent/'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTab).perform();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/homes/for_rent/multifamily,apartment_type/']")).isDisplayed());
    }
    @Test
    public void clickRentalBuildings() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement rentTab = driver.findElement(By.xpath("(//a[@href='/homes/for_rent/'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTab).perform();
        Thread.sleep(2000);
        String firstWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@title='Rental Buildings']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String secondWindowHandle = "";
        for (String handle : windowHandles) {
            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
                handle = secondWindowHandle;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        Assert.assertFalse(firstWindowHandle.equals(secondWindowHandle));
    }
    @Test
    public void clickApartmentsForRent() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement rentTab = driver.findElement(By.xpath("(//a[@href='/homes/for_rent/'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTab).perform();
        Thread.sleep(2000);
        String firstWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@title='Apartments for rent']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String secondWindowHandle = "";
        for (String handle : windowHandles) {
            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
                handle = secondWindowHandle;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        Assert.assertFalse(firstWindowHandle.equals(secondWindowHandle));
    }
    @Test
    public void clickHousesForRent() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement rentTab = driver.findElement(By.xpath("(//a[@href='/homes/for_rent/'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(rentTab).perform();
        Thread.sleep(2000);
        String firstWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@title='Houses for rent']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        String secondWindowHandle = "";
        for (String handle : windowHandles) {
            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
                handle = secondWindowHandle;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        Assert.assertFalse(firstWindowHandle.equals(secondWindowHandle));
    }
    @Test
    public void clickSearchBishkek() throws InterruptedException {
        driver.get("https://www.zillow.com/");
        WebElement rentTab = driver.findElement(By.xpath("(//a[@href='/homes/for_rent/'])[1]"));
        Actions actions = new Actions(driver);
        rentTab.click();
        Thread.sleep(2000);
        String firstWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        String secondWindowHandle = "";
        for (String handle : windowHandles) {
            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
                handle = secondWindowHandle;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        WebElement searchField = driver.findElement(By.xpath("//input[@class='react-autosuggest__input']"));
        searchField.click();
//        searchField.clear();
        actions.keyDown(Keys.CONTROL).perform();
        actions.sendKeys("a").perform();
        actions.keyUp(Keys.CONTROL).perform();
        actions.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(1000);
        searchField.sendKeys("Bishkek"+Keys.ENTER);
        List <WebElement> apartments= driver.findElements(By.xpath("//h3"));
        for (WebElement text:apartments){
            Assert.assertFalse(text.getText().contains("Bishkek"));
        }
    }
}