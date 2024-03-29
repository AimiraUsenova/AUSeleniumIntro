package com.techtorial.TestNGParameterPractice;

import com.techtorial.TestBase;
import com.techtorial.pages.OrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends TestBase {
    //to be able to call my driver ,instead of creating all m etyhod from TestBase class

    OrangeHRMPage orange=new OrangeHRMPage(driver);//its coming from testBase



    @Test
    public void loginTest() throws InterruptedException {

        OrangeHRMPage orange=new OrangeHRMPage(driver);

        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
        //Thread.sleep(2000);

        orange.username.clear();

        orange.username.sendKeys("admin");

        orange.password.clear();
        orange.password.sendKeys("admin123");

        orange.LoginButton.click();

        String actual=orange.pageTitle.getText();
        String expected="Dashboard";
        //Expected value is coming from the requirement

        Assert.assertEquals(expected,actual);


    }
}
