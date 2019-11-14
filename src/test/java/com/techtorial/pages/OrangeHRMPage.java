package com.techtorial.pages;
import com.techtorial.Util.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage {

    //without PageFactory.initElements method,your elements will not be initialized
    //it means ,you can not use your elements


    public OrangeHRMPage () {
        PageFactory.initElements(DriverUtil.driverSetup("chrome"),this);

        //return type of driver is webdriver

    }
    //i want to store my elements
    @FindBy(id="txtUsername")
    public  WebElement username;

    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement LoginButton;

    @FindBy(className="page-title")
    public WebElement pageTitle;


}
