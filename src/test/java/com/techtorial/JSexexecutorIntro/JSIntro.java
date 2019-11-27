package com.techtorial.JSexexecutorIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JSIntro {

    WebDriver driver;

    @BeforeClass
    public  void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void jsTest() throws InterruptedException {

       // driver.navigate().to("https://www.google.com");

        //1st way
        // driver.get("https://www.google.com");


        //2nd way
        //JavaScript Exexutor

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com'");

        //driver.getTitle();

        String title=js.executeScript("return document.title").toString();
        System.out.println("My page's title is :"+title);

        String url=js.executeScript("return document.URL").toString();
        System.out.println("My page's url is :"+url);

         //scroll down/up
       // driver.navigate().to("https://expedia.com");
        //js.executeScript("window.scrollBy(0,1500)");
        //Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0,-1500)");

        //generate a custom alert

       // js.executeScript("alert('My custom alert')");

       // WebElement button=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search'] "));
        //div[@id='searchform']
        //click
       // js.executeScript("arguments[0].click()",button);


        driver.navigate().to("https://amazon.com");
        //another way locating element
        //sendkeys
        js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone';");



    }
}
