package com.techtorial;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase {

  public static WebDriver driver;

  @Parameters("driverName")
  @BeforeClass(alwaysRun = true)
    public void setUpDriver(String driverName) {

        driver= DriverUtil.driverSetup(driverName);//from parameters

      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


  }
    //@AfterClass
    public void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
