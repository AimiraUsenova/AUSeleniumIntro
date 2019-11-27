package com.techtorial.cookiesIntro;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Cookies1 {

    @Test

    public void getCookies() {

        Cookie cookie =new Cookie("abid","50b73dc7-e310-cebf-ba5a-20ad5d65eb42");
        WebDriver driver =new ChromeDriver();
        driver.manage().addCookie(cookie);

    }
}
