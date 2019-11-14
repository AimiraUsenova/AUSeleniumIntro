package com.techtorial.Tests.Practice;


import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Set;

public class letsKodeIt {

    WebDriver driver;

//    @Before
//    public void setup() {
//
//
//    }

    @Test

    public void radioButton() {

       driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
    }

    @Test

    public void  radioButton2() {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.xpath("//input[@id='benzradio']")).click();

    }

    @Test

    public void radioButton3() {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.xpath("//input[@id='hondaradio']")).click();

    }

    @Test
    public void checkBox() {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
       WebElement  ai= driver.findElement(By.xpath("//input[@id='bmwcheck']"));
       ai.click();
       ai.isSelected();


    }

    @Test

    public  void checkBox2() {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement  ai1= driver.findElement(By.xpath("//input[@id='benzcheck']"));
        ai1.click();
        ai1.isSelected();

    }

    @Test
    public  void checkBox3() {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement  ai2= driver.findElement(By.xpath("//input[@id='hondacheck']"));
        ai2.click();
        ai2.isSelected();

    }

    @Test

    public void select() throws InterruptedException {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement  sl= driver.findElement(By.xpath("//select[@id='carselect']"));

        Select sl1=new Select(sl);
        sl1.selectByVisibleText("Honda");
        Thread.sleep(5000);
        DriverUtil.closeDriver();
    }

    @Test
    public void multipleSelect () {

        driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");

//        driver.get("");
        Select dropDrown =new Select(driver.findElement(By.id("multiple-select-example")));

        dropDrown.selectByVisibleText("Apple");
        dropDrown.selectByVisibleText("Peach");
        dropDrown.selectByVisibleText("Orange");
    }

    @Test
    public void openWindow () {

       driver= DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");

        WebElement newWinButton=driver.findElement(By.xpath("//button[@id='openwindow']"));

        String firstWinTitle=driver.getTitle();
        System.out.println("first window title is :" +firstWinTitle);

        String firstWinHandle=driver.getWindowHandle();

        newWinButton.click();

        String secWinTitle="";

        for(String handle :
        driver.getWindowHandles()) {
            if(!handle.equalsIgnoreCase(firstWinHandle))
                secWinTitle=handle;

        }

        driver.switchTo().window(secWinTitle);
        String secondWinHandle=driver.getTitle();

        Assert.assertFalse(firstWinTitle.equalsIgnoreCase(secondWinHandle));
    }

    @Test
    public void openWindow2() throws InterruptedException {
        driver = DriverUtil.driverSetup("Chrome");
        driver.get("https://learn.letskodeit.com/p/practice");

        String originalWindow= driver.getWindowHandle();
        String originalWindowTitle = driver.getTitle();

        System.out.println("First window title is :"+ originalWindow);
        driver.findElement(By.id("openwindow")).click();

        Set<String> windowHandles= driver.getWindowHandles();
        String window2="";
        for (String w:windowHandles){
            if (!w.equals(originalWindow)){
                window2=w;
            }
        }
        driver.switchTo().window(window2);

        String window2Title = driver.getTitle();

        Thread.sleep(4000);
        //Assert by title

        Assert.assertTrue(!originalWindowTitle.equals(window2Title));
        //Assert by url
        Assert.assertEquals("https://letskodeit.teachable.com/courses",driver.getCurrentUrl());
        //Assert by handle
        System.out.println(window2);
        Assert.assertFalse(originalWindow.equalsIgnoreCase(window2));
    }












}
