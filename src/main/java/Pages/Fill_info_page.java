package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_info_page extends Pagebase{

    public Fill_info_page(WebDriver driver) {
        super(driver);
    }
    Select Daylist=new Select(driver.findElement(By.id("days")));
    Select monthlist= new Select(driver.findElement(By.id("months")));
    Select yearlist = new Select(driver.findElement(By.id("years")));
    Select country= new Select(driver.findElement(By.id("country")));
    By Mrbutton =By.id("uniform-id_gender1");
    By nameField = By.className("form-control");
    By emailfieldfield= By.id("email");
    By passwordfield=By.id("password");
    By checkup_box=By.cssSelector("label[for=\"newsletter\"]");
    By firstnamefield =By.id("first_name");
    By lastnamefield=By.id("last_name");
    By companyfield=By.id("company");
    By statefield=By.id("state");
    By adressfield=By.id("address1");
    By submitbutton=By.className("btn-default");


    By cityfield=By.id("city");
    By zipcodefield=By.id("zipcode");
    By mobilenumberfield = By.id("mobile_number");
    String name= "mohamed";
    String firstname= "khaled";
    String email= "mohame@gmail.com";
    String Firstname= "moahmed";
    String lastname="marzouq";
    String state ="cairo";
    String zipcode="54578";
    String mobilnumber="54785";
    String company="freelancer";
    String password="599898";
    String adress="gfjcairo fnhgnfgkfkgn";
    String city="cairo";

    public void choosemr(){
        clickonelement(Mrbutton);
    }
    public void entername(){
        sendkey(nameField,name);
    }
    public void enteremail(){
        sendkey(emailfieldfield,email);
    }
    public void enterfirstname(){
        sendkey(firstnamefield,firstname);
    }
    public void enterlastname(){
        sendkey(lastnamefield,lastname);
    }
    public void enterzipcode(){
        sendkey(zipcodefield,zipcode);
    }
    public void entercompany(){
        sendkey(companyfield,company);
    }
    public void entermobilnunmber(){
        sendkey(mobilenumberfield,mobilnumber);
    }


    public void selectday(){

        selectelement( Daylist,5);
    }
    public void selelctmonth(){
        selectelement(monthlist,2);
    }
    public void  selectyear(){
        selectelement(yearlist,1);
    }
    public void enterpassword(){
        sendkey(passwordfield,password);
    }
    public void choosecheckbox(){
        clickonelement(checkup_box);
    }
    public void enteradress(){
        sendkey(adressfield,adress);
    }
    public void choosecountry (){
        selectelement(country,4);
    }
    public void  enterstate(){
        sendkey(statefield,state);
    }
    public void  entercity(){
        sendkey(cityfield,city);
    }
    public void submit(){
        clickonelement(submitbutton);
    }









}
