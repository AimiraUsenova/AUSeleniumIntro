package com.techtorial.Tests.ActionPractice;


import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HoverOver {

    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver= DriverUtil.driverSetup("Chrome");
    }

    @Test
     public void hover() {
        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement hoversText=driver.findElement(By.xpath("//h3"));

        Assert.assertEquals("Hovers",hoversText.getText());

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/users/2']/../../img"))).perform();

        WebElement username=driver.findElement(By.xpath("//a[@href='/users/2']//preceding-sibling::h5"));
        Assert.assertFalse(username.getText().contains("user 2"));
    }

}
