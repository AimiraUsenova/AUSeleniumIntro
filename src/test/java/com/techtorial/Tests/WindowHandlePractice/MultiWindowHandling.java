
package com.techtorial.Tests.WindowHandlePractice;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;
public class MultiWindowHandling {
    @Test
    public void windowIntro() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        String originalWindowHandle = driver.getWindowHandle();
        WebElement window2 = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        window2.click();

        Set<String> setOfWindowHandles = driver.getWindowHandles();
        String secondWindowHandle = "";
        for(String dh:setOfWindowHandles){
            if(!dh.equalsIgnoreCase(originalWindowHandle)){
                secondWindowHandle = dh;
            }
        }
        driver.switchTo().window(secondWindowHandle);
//      driver.navigate().to("https://the-internet.herokuapp.com/windows/new");
//
        System.out.println(driver.findElement(By.xpath("//h3[.='New Window']")).getText());
        driver.switchTo().window(originalWindowHandle);
        window2.click();
        Thread.sleep(5000);
        driver.quit();
    }
}




