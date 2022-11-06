package mouse_hover;

import base.BasePage;
import org.testng.annotations.Test;
import pagelibrary.MouseHover;

public class TestMouseHover extends BasePage {
   @Test
    public void testMouseHover (){
       MouseHover mouseHover = new MouseHover();


       mouseHover.setElement();
       mouseHover.setAddToCart();

       System.out.println(getTrimmedElementText(mouseHover.addToCart));


    }
}
