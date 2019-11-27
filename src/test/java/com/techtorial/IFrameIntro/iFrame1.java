package com.techtorial.IFrameIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class iFrame1 {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void iframe() {

        driver.get("http://the-internet.herokuapp.com/iframe");
        //WebElement iframe1 = driver.findElement(By.xpath(" //iframe[@id='ape_Gateway_desktop-ad-center-1_desktop_iframe']"));
       // iframe1.click();


        //switch to frame using index
        //driver.switchTo().frame(0);

        //switch frame using webelement
       // WebElement element = driver.findElement(By.tagName("p"));
        WebElement element = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(element);

        WebElement element1=driver.findElement(By.id("tinymce"));
        String expectedTxt="hello from techtorial";
        element1.clear();
        element1.sendKeys(expectedTxt);
        Assert.assertEquals("failed to assert text in text box",expectedTxt,element1.getText());



        driver.switchTo().parentFrame(); //going out of the iframe (only one step out)

        driver.switchTo().defaultContent();//bring to the very first iframe




//        String firstWindowHandle = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        String secondWindowHandle = "";
//        for (String handle : windowHandles) {
//            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
//                secondWindowHandle = handle;
//            }
//        }
//        driver.switchTo().window(secondWindowHandle);
//        driver.close();
//      //  Assert.assertTrue(firstWindowHandle.equals(secondWindowHandle));
//        driver.findElement(By.xpath("//img[@alt='Print-at-Home']")).click();
//    }


        // Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Print-at-Home']")).isDisplayed());
    }
}

