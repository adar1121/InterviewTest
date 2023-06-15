package Screens.AutomationTesting;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register extends BasePage {


    private WebDriver driver;
    private String email = "moti123@gmail.com";
    public Register(WebDriver driver){
        this.driver = driver;
    }
    public void openWebsite(){
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    public void enterEmailStartScreen(){
        sendKeysToElement(By.id("email"),email);
        clickElement(By.id("enterimg"));
    }

    public void setFirstNameRegister(){
       String firstName = "Moti";
       sendKeysToElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"),firstName);
    }

    public void setLastNameRegister(){
        String lastName = "Cohen";
        sendKeysToElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"),lastName);
    }

    public void setAddressRegister(){
        String address = "lando 2";
        sendKeysToElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"),address);
    }

    public void setEmailAddressRegister(){
        sendKeysToElement(By.cssSelector("input[ng-model=EmailAdress]"),email);
    }

    public void setPhoneRegister(){
        String phone = "0521234567";
        sendKeysToElement(By.cssSelector("input[ng-model=Phone]"),phone);
    }

    public void setGenderRegister(){
        clickElement(By.cssSelector("input[value=Male]"));
    }

    public void setHobbiesRegister(){
        clickElement(By.id("checkbox1"));
        clickElement(By.id("checkbox2"));
    }

    public void setLanguagesRegister(){
        clickElement(By.id("msdd"));
        clickElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
        clickElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[15]/a"));
    }

    public void setSkillsRegister(){
        Select selectSkills = new Select(getWebElement(By.id("Skills")));
        selectSkills.selectByValue("Java");
    }

    public void setCountryRegister(){
        Select selectCountry = new Select(getWebElement(By.id("country")));
        selectCountry.selectByIndex(10);
    }

    public void setDateOfBirthRegister(){
        Select selectYear = new Select(getWebElement(By.id("yearbox")));
        Select selectMonth = new Select(getWebElement(By.cssSelector("select[ng-model=monthbox]")));
        Select selectDay = new Select(getWebElement(By.id("daybox")));
        selectYear.selectByValue("1990");
        selectMonth.selectByValue("September");
        selectDay.selectByIndex(9);
    }

    public void setPasswordRegister(){
        String password = "123456";
        sendKeysToElement(By.id("firstpassword"),password);
        sendKeysToElement(By.id("secondpassword"),password);
    }

    public void uploadPhotoRegister(){
        sendKeysToElement(By.id("imagesrc"),"C:\\Users\\user\\Desktop\\picture.png");
    }

    public void pressSumbitButtonRegister(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('submitbtn').click()");
    }
}
