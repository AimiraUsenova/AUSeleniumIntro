
package com.techtorial.Tests.Practice;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class instagram {
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/accounts/login/?source=auth_switcher']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("aimirausenova");
        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
        pass.click();
        Thread.sleep(1000);
        pass.sendKeys("123445");
        driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']")).click();
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("kubat.kub");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='z556c']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='_9AhH0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='dCJp8 afkep'])[2]")).click();
        Thread.sleep(4000);
        driver.quit();
//        Thread.sleep(3000);
//        driver.quit();
    }
}




