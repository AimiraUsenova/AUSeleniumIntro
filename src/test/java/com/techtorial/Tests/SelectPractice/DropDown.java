
package com.techtorial.Tests.SelectPractice;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
public class DropDown {
    @Test
    public void amazon() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select amazonSelect = new Select(searchDropDown);
        amazonSelect.getOptions();
        Thread.sleep(1000);
    }
    @Test
    public void select() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
//        WebElement dropDown = driver.findElement(By.id("dropdown"));
//        Select select = new Select(dropDown);
//        select.selectByValue("2");
//
//        Thread.sleep(1000);
//
//        driver.navigate().back();
//        driver.findElement(By.xpath("//a[@href='/checkboxes']"));
//        WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//        checkBox.click();
//        Assert.assertTrue(checkBox.isSelected());
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement e: list){
            if(!e.isSelected()){
                e.click();
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}




