package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Pagebase {
    WebDriver driver;


    public Pagebase(WebDriver driver){ this.driver = driver;}


    public void clickonelement(By elemnt){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elemnt));


        driver.findElement(elemnt).click();
    }

    public  void sendkey(By element , String text){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(element).sendKeys(text);
    }
    public void selectelement(Select element, int number){
        element.selectByIndex( number);
    }


}
