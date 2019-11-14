package com.techtorial.Tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchField {

   static WebDriver driver;
   @BeforeClass

   public void setup(){

       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
//       driver=DriverUtil.driverSetup("ff");
//       WebDriverManager.firefoxdriver().setup();
//       driver = new FirefoxDriver();
   }

    @Test
    public void googleS() {
        //driver = DriverUtil.driverSetup("chrome");
        driver.get("https://google.com");
        WebElement searchF=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchF.click();
        searchF.sendKeys("selenium");

        driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();

        Actions act=new Actions(driver);

        act.keyDown(Keys.COMMAND).perform();

        WebElement link=driver.findElement(By.xpath("//a[@href='https://www.seleniumhq.org/']"));
        link.click();
   }

    public  void selectAll() {

       driver.get("https://google.com");
       WebElement searchF=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
       searchF.click();
       searchF.sendKeys("selenium");

       driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();


       Actions act=new Actions(driver);
       act.keyDown(Keys.COMMAND).sendKeys("A").perform(); //for copy whole page


   }

}
