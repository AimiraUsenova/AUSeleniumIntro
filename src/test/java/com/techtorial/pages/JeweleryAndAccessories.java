package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JeweleryAndAccessories {

   WebDriver driver;

 public JeweleryAndAccessories(WebDriver driver) {
      this.driver=driver;
        PageFactory.initElements(driver,this); //this-current instance
    }

    @FindBy(xpath ="  //a[@data-path='Any price'] " )
    WebElement anyPrice;


    @FindBy(xpath ="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=&max=25&price_bucket=1']" )
    WebElement under25;

    @FindBy(xpath="//a[@href='https: //www.etsy.com/c/jewelry_and_accessories?explicit=1&min=25&max=50&price_bucket=1")
            WebElement prices25to50;

    @FindBy(xpath="https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=50&max=100&price_bucket=1")
    WebElement prices50to100;

    @FindBy(xpath ="//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=100&max=&price_bucket=1']" )
    public WebElement over100;


    @FindBy(id ="ship_to_select" )
    public WebElement shipTo;


    @FindBy(id="a")
    public List<WebElement> elementList; //









}
