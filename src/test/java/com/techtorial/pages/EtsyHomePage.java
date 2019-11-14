package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage { //storage class

    public EtsyHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this); //this-current instance
    }
    @FindBy(id="global-enhancements-search-query") //new formating locating element
    WebElement searchField;

    @FindBy(id="register")
    WebElement register;

    @FindBy(xpath ="//a[@href='https://www.etsy.com/cart?ref=hdr-cart']" )
   public  WebElement cart;

    @FindBy(id="catnav-primary-link-10855")
    public WebElement jewelryAndAccessoriesLink ;



}
