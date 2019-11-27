package com.techtorial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HWPhantomJSDriver {

    @Test
    public void PhantomJSDriver() {
        WebDriverManager.phantomjs().setup();
        WebDriver driver=new org.openqa.selenium.phantomjs.PhantomJSDriver();
        driver.get("https://amazon.com");
        System.out.println("PhantomJSDriver : Title of AMAZON page is "+driver.getTitle());
        System.out.println("PhantomJSDriver : Current URL of Amazon page is "+driver.getCurrentUrl());

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Iphone");
    }

    @Test
    public void HTMLUnitDriver() {
        WebDriver driver =new HtmlUnitDriver();
        driver.get("https://amazon.com");
        System.out.println(" HTMLUnitDriver: Title of AMAZON page is "+driver.getTitle());
        System.out.println(" HTMLUnitDriver : Current URL of Amazon page is "+ driver.getCurrentUrl());

        WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
        search1.sendKeys("iphone ");
    }
}

