package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends Pagebase {

    public Homepage(WebDriver driver) {
        super(driver);
    }
    By singupbutton = By.cssSelector("a[href='/login']");


    public void clickonsingupbutton(){
        clickonelement(singupbutton);
    }

}
