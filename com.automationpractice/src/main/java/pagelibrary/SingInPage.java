package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingInPage extends BasePage {
    @FindBy(id = "email")
    public WebElement emailAddressFild;

    @FindBy (id = "passwd")
    public WebElement passord;

    @FindBy(className = "page-heading")
    public WebElement forCheckPage;          // find locator for search Btn

    public SingInPage(){
        PageFactory.initElements(driver,this);
    }

    public void typeEmail(){
        sendKeysToElement(emailAddressFild, "hemalhemu7@gmail.com");
    }
    public void enterPassord(){
        sendKeysToElement(passord, "2022");
    }


}
