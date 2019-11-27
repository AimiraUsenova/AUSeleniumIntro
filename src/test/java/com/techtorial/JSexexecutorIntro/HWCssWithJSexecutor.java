package com.techtorial.JSexexecutorIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HWCssWithJSexecutor {
    WebDriver driver;

    @BeforeClass
    public  void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Test
    public void homeWorkJS() throws InterruptedException {

        JavascriptExecutor ok=(JavascriptExecutor) driver;
        ok.executeScript("window.location='https://ok.ru'");

        String title=ok.executeScript("return document.title").toString();
        System.out.println("OK's title is :"+title);

        String url=ok.executeScript("return document.URL").toString();
        System.out.println("OK's url is :"+url);


        ok.executeScript("window.scrollBy(0,1500)");
    }

    //    css= #twotabsearchtextbox
    //<tagName>.<class attribute value>


   // #field_email ---for login
   // #field_password  ===for password
    // input[class='button-pro __wide'] ==login button
    // a[class='lp'] ==can't log in ?

    //div[class='external-oauth-login_title mt-6x'] = no profile on ok

    // a[class='button-pro __sec __wide mb-3x'] ==registartion









}
