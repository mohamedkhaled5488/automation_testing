import Pages.Fill_info_page;
import Pages.Homepage;
import Pages.Signuppage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Registertiontest  extends Testbase{

    Homepage homepageobject ;
    Signuppage signuppage;
    Fill_info_page fill_info_page;
    SoftAssert softassert =new SoftAssert();
    @Test(priority = 1)
    public void testcaseone() throws InterruptedException {
        homepageobject = new Homepage(driver);

        homepageobject.clickonsingupbutton();
        Assert.assertEquals(driver.getTitle(),"Automation Exercise - Signup / Login");
        signuppage = new Signuppage(driver);
        softassert.assertEquals(driver.getTitle(),"gfgm");

        signuppage.fillnamefiled();
        signuppage.fillemailfiled();
        signuppage.clickonsignupbutton();

    }
    @Test(priority =2 )
    public void testcasetwo(){
        fill_info_page = new Fill_info_page(driver);
        fill_info_page.choosemr();
//        fill_info_page.entername();
        softassert.assertTrue(driver.findElement(By.id("email")).isEnabled());
        fill_info_page.enteremail();

        fill_info_page.enterpassword();
        fill_info_page.selectday();
        fill_info_page.selelctmonth();
        fill_info_page.selectyear();
        fill_info_page.choosecheckbox();
        fill_info_page.enterfirstname();
        fill_info_page.enterlastname();
        fill_info_page.entercompany();
        fill_info_page.enteradress();
        fill_info_page.choosecountry();
        fill_info_page.enterstate();
        fill_info_page.entercity();
        fill_info_page.enterzipcode();
        fill_info_page.entermobilnunmber();
        fill_info_page.submit();

    }

}
