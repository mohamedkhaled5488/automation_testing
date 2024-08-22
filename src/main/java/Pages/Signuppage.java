package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuppage extends Pagebase {

    public Signuppage(WebDriver driver) {
        super(driver);
    }
    By namefiled = By.name("name");
    By emailfiled = By.cssSelector("input[data-qa=\"signup-email\"]");
    By signupbutton = By.cssSelector("button[data-qa=\"signup-button\"]");
    String name = "jjo";
    String email = "moha@gmail.com";



    public void fillnamefiled (){
        sendkey(namefiled,name);
    }
    public void fillemailfiled(){
        sendkey(emailfiled,email);
    }
    public void clickonsignupbutton(){
        clickonelement(signupbutton);
    }
}
