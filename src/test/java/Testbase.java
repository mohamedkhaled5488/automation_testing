import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Scanner;

public class Testbase {
    public WebDriver driver;
@BeforeTest
    public void startbrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://automationexercise.com/");
    System.out.println("this is from testbase");
}

@AfterTest
    public  void  closebrowser() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();

}





}