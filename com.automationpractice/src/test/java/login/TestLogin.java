package login;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.HomePage;
import pagelibrary.SingInPage;

public class TestLogin extends BasePage {

    @Test
    public void testLogin(){
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();


        SingInPage singInPage = new SingInPage();
        singInPage.typeEmail();
        singInPage.enterPassord();
        Assert.assertTrue(isElementVisible(singInPage.forCheckPage));
    }
}
