package com.techtorial.Tests.ActionPractice;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragAndDrop {
    WebDriver driver;
    @Test
    public void drag(){
        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions = new Actions(driver);
        WebElement one = driver.findElement(By.id("column-a"));
        WebElement two = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(one,two).perform();
    }
    @Test
    public void drag2(){
        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        Actions actions = new Actions(driver);



    }
}




