package com.techtorial.TestNGParameterPractice;

import com.techtorial.TestBase;
import com.techtorial.pages.OrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider extends TestBase {

    @DataProvider(name="Credentials")
    public static Object[][] credential () {
        return new  Object [] [] {{"admin","admin123"},{"testUserName","testPassword"},
                {"admin","testPassword"},{"testUserName","admin"}};
    }

    @Test(dataProvider = "Credentials")
    public void loginPageTest(String orangeUsername,String orangePassword ) {

        OrangeHRMPage orange=new OrangeHRMPage(driver);
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
        //differences navigate to method waiting for elements loaded
        orange.username.clear();
        orange.username.sendKeys(orangeUsername);

        orange.password.clear();
        orange.password.sendKeys(orangePassword);

        orange.LoginButton.click();

        if(orangeUsername.equals("admin") & orangePassword.equals("admin123")){
            String actual=orange.pageTitle.getText();
            String expecrted="Dashboard";

            Assert.assertEquals(expecrted,actual);

            orange.dropDown.click();
            orange.logout.click();

        }else{
            String actual =orange.retryLogin.getText();
            String expected="Retry Login";

            Assert.assertEquals(expected,actual);

            driver.navigate().back();
        }





    }
}
