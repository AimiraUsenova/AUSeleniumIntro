package com.techtorial.Tests.ActionPractice;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MouseActions {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverUtil.driverSetup("chrome");
    }

    //first time initialized in this line


    @Test
    public void test1() {
        driver=DriverUtil.driverSetup("chrome");
        //since we initialized it before ,it will not initialize this line because singleton pattern

        driver= DriverUtil.driverSetup("ff");

    }
    @Test
    public void mouseActionsIntro(){
        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.id(""));

        //for right click
        actions.contextClick().perform();

        //hover over
        actions.moveToElement(webElement);

        //drag and drop
        actions.dragAndDrop(webElement,webElement);
    }
}




