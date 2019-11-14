package com.techtorial.Tests.ActionPractice;


import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SliderTask {

    static WebDriver driver;

    public static void horizMethod(int a) throws Exception {

        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));

        Actions actions= new Actions(driver);
        if (a==1) {
            actions.dragAndDropBy(slider,1,0).perform() ;
        }else if (a==2) {
            actions.dragAndDropBy(slider,10,0).perform() ;
        }else if (a==3) {
            actions.dragAndDropBy(slider,20,0).perform() ;
        }else if (a==4) {
            actions.dragAndDropBy(slider,30,0).perform() ;
        }else if (a==5) {
            actions.dragAndDropBy(slider,40,0).perform() ;
        }else {
            throw new Exception("incorrect input ");
        }
    }
    @BeforeClass
    public void setup() {
        driver= DriverUtil.driverSetup("Chrome");
    }
//    @Test
//
//    public void testSlider() {
//        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
//        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
//
//        Actions actions= new Actions(driver);
//
//         actions.dragAndDropBy(slider,50,0).perform() ;
//
//        }

        @Test
    public void horizMethod2() throws Exception {
        horizMethod(1);
        }
}

