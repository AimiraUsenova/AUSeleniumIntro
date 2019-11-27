package com.techtorial.IFrameIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iframe2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @Test
    public void HandleIframe() {

        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement element=driver.findElement(By.id("tinymce"));

    String expectedTxt="hello from techtorial";
        element.clear();

        element.sendKeys(expectedTxt);
        Assert.assertEquals("failed to assert text in text box",expectedTxt,element.getText());
}
}
