package com.techtorial.Tests.Practice;

import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomeWorkOK {

    static WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void ok() throws InterruptedException {

        driver.get("https://ok.ru/");

        driver.findElement(By.xpath("//label[@for='field_email']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='field_email']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[@for='field_password']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='field_password']")).click();
        Thread.sleep(3000);

        //Actions actions = new Actions(driver);

        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@data-l='t,restore']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class-l='external-oauth-login_title-tx']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@data-l='t,register']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[@class='social-icon __s __mailru']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("/div[@class='social-icon __s __gp']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[@class='social-icon __s __fb']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@target='_top']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[.='API']")).click();  //api
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@href='/help?st.cmd=helpFaq&st.origin=FTR&st._aid=FatFooter_helpFaqAnonym']")).click();
        //help
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //a[@href='/regulations?st.cmd=helpContent&st._aid=FatFooter_helpRegulations']")).click();
        //licence aggreement
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //a[@href='/privacypolicy'] ")).click(); //privace plicy
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //a[@href='/ok'] ")).click(); //news
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //a[@href='mall']")).click(); //goods
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //a[@href='http://v.ok.ru/'] ")).click(); //vacancies
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //a[@href='http://corp.mail.ru'] ")).click(); //about company
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //p[@class='ff_copy']")).click(); //LLC mail.ru
        Thread.sleep(4000);


        driver.findElement(By.xpath(" //div[@class='ft __anonym']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //div[@data-promo='october']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath(" //div[@id='footer']")).click();
        Thread.sleep(4000);



        driver.findElement(By.xpath(" ")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(" ")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(" ")).click();
        Thread.sleep(4000);












    }
}
