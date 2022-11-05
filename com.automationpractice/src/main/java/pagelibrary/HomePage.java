package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
   @FindBy(className = "login")        // Locator
   public WebElement signInBtn;

   @FindBy( id = "search_query_top")
   public WebElement doSerach;


    public HomePage (){                                                        // constuctor

        PageFactory.initElements(driver,this);
    }

    public void clickSignInBtn ( ){
        clickOnElement(signInBtn);
    }
    public void searchFild(){                                           // Home page Element
        sendKeysToElement(doSerach,"Printed Summer Dress");
    }
    @FindBy(name = "submit_search")
    public WebElement clickBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    public WebElement selectItem;

    @FindBy(id = "color_14")
    public WebElement selectColor;




}
