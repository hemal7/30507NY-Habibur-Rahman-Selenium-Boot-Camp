package navigation;

import base.BasePage;
import org.testng.annotations.Test;
import pagelibrary.HomePage;

public class TestSearchItem extends BasePage {

    @Test
   public void TestSearchItem () throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.searchFild();

        homePage.clickBtn.click();

        homePage.selectItem.click();

       homePage.selectColor.click();

        Thread.sleep(5000);
    }

}
