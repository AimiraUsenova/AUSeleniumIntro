package com.techtorial.Headlessdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class headlessDriver {

     @Test
    public void setHTMLUnitDriver() {
         WebDriver driver =new HtmlUnitDriver();
         driver.get("https://google.com");
         System.out.println(driver.getTitle());
     }
     @Test
    public void setPhantomJSDriver() {
         WebDriverManager.phantomjs().setup();
         WebDriver driver=new PhantomJSDriver();
         driver.get("https://google.com");
         System.out.println(driver.getTitle());
     }
}
