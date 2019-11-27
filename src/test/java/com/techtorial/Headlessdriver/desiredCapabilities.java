package com.techtorial.Headlessdriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class desiredCapabilities {

    @Test
    public void desiredCapabilities() {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"meSpecialBrowser");
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        desiredCapabilities.setCapability(CapabilityType.VERSION,"5.7");

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME,"my special browser");
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME,Platform.MAC);
        chromeOptions.setCapability(CapabilityType.VERSION,"5.7");

        WebDriver driver=new ChromeDriver(desiredCapabilities);
    }
}
