
package com.techtorial.Tests.AlertPractice;
import com.techtorial.Util.DriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//import static com.techtorial.utility.DriverUtil.driverSetup;
public class Alert {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = DriverUtil.driverSetup("Chrome");
    }
    @Test
    public void alertIntro() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void allert2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/javascript_alerts']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("123");
        driver.switchTo().alert().accept();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}




