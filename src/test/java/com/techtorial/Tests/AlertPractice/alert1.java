package com.techtorial.Tests.AlertPractice;


import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class alert1 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test


    public void al() {
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();


    }


    @Test
    public void al1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();



    }
}
