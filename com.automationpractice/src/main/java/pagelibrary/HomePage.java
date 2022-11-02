package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
   @FindBy(className = "login")        // Locator
   public WebElement signInBtn;


    public HomePage (){                                                        // constuctor
        PageFactory.initElements(driver,this);
    }
    public void clickSignInBtn ( ){
        clickOnElement(signInBtn);
    }



}
