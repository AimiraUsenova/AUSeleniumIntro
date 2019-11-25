package com.techtorial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class PhantomJSDriver {

    @Test
    public void PhantomJSDriver() {
        WebDriverManager.phantomjs().setup();
        WebDriver driver=new org.openqa.selenium.phantomjs.PhantomJSDriver();
        driver.get("https://amazon.com");
        System.out.println("Title of AMAZON page is "+driver.getTitle());
        System.out.println("Current URL of Amazon page is "+driver.getCurrentUrl());

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Iphone");
    }

    @Test
    public void setHTMLUnitDriver() {
        WebDriver driver =new HtmlUnitDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}

