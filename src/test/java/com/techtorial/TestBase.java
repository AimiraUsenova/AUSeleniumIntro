package com.techtorial;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {

  public WebDriver driver;

  @Parameters("driverName")

    @BeforeClass
    public void setUpDriver(String driverName) {

        driver= DriverUtil.driverSetup(driverName);//from parameters

    }
    //@AfterClass
    public void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
