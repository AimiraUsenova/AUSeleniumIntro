package com.techtorial.Tests.Practice;

import com.techtorial.Util.DriverUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.EtsyHomePage;
import Pages.JeweleryAndAccessories;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class JeweleryAndAccessoriesTest {

    /*
    1.Navigate to etsy.com home page
    2.verify you are on etsy home page
   3. Navigate to Jew and Accessories page
    4.Verify you are on Jew and Acces page
    5.Select a price range Over 100
   6.select a shipping coutry as Germany
     */

    // WebDriver driver=DriverUtil.driverSetup("chrome");
    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }


    @Test
    public void etsy() throws InterruptedException, MalformedURLException {

        //navigate you are on home page
        driver.get("https://www.etsy.com");

        URL url = new URL("https://www.google.com");
        driver.navigate().to(url);


        driver.navigate().to("  ");
        driver.navigate().refresh(); //refresh page
        driver.navigate().back(); //go back
        driver.navigate().forward();//go forward

        //Verify you are on home page
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(3000);

        EtsyHomePage ehp = new EtsyHomePage(driver);


        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.elementToBeClickable(ehp.jewelryAndAccessoriesLink));

        //navigate on Jew and Acces page and verify
        driver.get("https://www.etsy.com/c/jewelry-and-accessories?ref=catnav-10855");

        Assert.assertTrue(driver.findElement(By.xpath(" //a[@href='https://www.etsy.com/cart?ref=hdr-cart']")).isDisplayed());
        // Thread.sleep(1000);

        // driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("  //a[@data-path='Any price'] ")).isDisplayed());

        JeweleryAndAccessories page = new JeweleryAndAccessories(driver);
        page.over100.click();

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // Thread.sleep(1000);

        page.shipTo.sendKeys("Germany");

    }

    @AfterTest
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {

            long timestamp = System.currentTimeMillis();

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //storing in file object

            FileUtils.copyFile(src, new File("src/screenshots/" + timestamp + ".jpg"));
            //saving in some place
            //timestamp==stamp of time (show exact time when it was taken)
            //

        }
        driver.close();
    }
}
