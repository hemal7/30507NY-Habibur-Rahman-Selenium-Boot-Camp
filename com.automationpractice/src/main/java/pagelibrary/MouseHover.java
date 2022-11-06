package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class MouseHover extends BasePage {

    @FindBy(xpath = "//ul[@id='homefeatured']//li[1]")
    public WebElement element;
@FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]/span")
public WebElement addToCart;

    public MouseHover(){PageFactory.initElements(driver,this);}

    public void setElement (){
        hoverOverElement(element);
    }
    public void setAddToCart(){ clickOnElement(addToCart);}


}
